package com.example.foodike.presentation.cart

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.foodike.data.data_source.FakeData
import com.example.foodike.databinding.FragmentAddToCartBinding
import com.example.foodike.domain.model.CartItem
import com.example.foodike.domain.model.FoodItem
import com.google.android.material.tabs.TabLayoutMediator

class AddToCartFragment : Fragment() {
    private lateinit var binding: FragmentAddToCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddToCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            introViewPager.adapter = ItemCarouselAdapter()
            TabLayoutMediator(intoTabLayout, introViewPager) { tab, position -> }.attach()
        }
        val itemId = arguments?.getInt("itemId")?: 0
        val foodItem = FakeData.filterWithId(itemId)
        binding.apply {
            deliveryInfo.text = foodItem.deliveryInfo
            returnPolicy.text = foodItem.returnPolicy
            foodItemName.text = foodItem.name
            foodItemPrice.text = foodItem.price
            backbutton.setOnClickListener{
                activity?.finish()
            }
            buttonAddToCart.setOnClickListener {
                val cartItemList = FakeData.cartItemList
                if (cartItemList.isEmpty()){
                    FakeData.cartItemList.add(CartItem(foodItem,1))

                }else{
                   val cartItem = FakeData.cartItemList.filter {
                        cartItem -> cartItem.foodItem.itemId == itemId
                    }.get(0)
                    val index = FakeData.cartItemList.indexOf(cartItem)
                    cartItem.quantity += 1
                    FakeData.cartItemList.set(index,cartItem)
                }

                Intent(activity, ViewCartActivity::class.java).apply {
                    requireContext().startActivity(this)
                }

            }

            favouriteButton.setOnClickListener {
                addToFavourite(foodItem)
                Toast.makeText(binding.root.context,"Added To Favourite",Toast.LENGTH_SHORT).show()
            }



        }

    }
    fun addToFavourite(foodItem: FoodItem){
        foodItem.isFavourite = true
        FakeData.favouriteItemList.add(foodItem)

    }

}