package com.example.foodike.presentation.food

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodike.data.data_source.FakeData
import com.example.foodike.databinding.FragmentFavouriteBinding
import com.example.foodike.domain.model.FoodItem
import com.example.foodike.presentation.cart.CartActivity

class FavouriteFragment : Fragment() {


    private lateinit var binding: FragmentFavouriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = FoodItemAdapter(onFoodItemClick = ::handleFoodItemClick).apply {
                addFoodItems(FakeData.getFoodItemList())
            }
            addItemDecoration(VerticalSpaceItemDecoration(48))
            setHasFixedSize(true)
        }
    }
    fun handleFoodItemClick(foodItem: FoodItem) {
        val bundle = Bundle().apply {
            putInt("itemId", foodItem.itemId)
        }
        Intent(activity, CartActivity::class.java).apply {
            putExtras(bundle)
            requireContext().startActivity(this)
        }
    }

}


