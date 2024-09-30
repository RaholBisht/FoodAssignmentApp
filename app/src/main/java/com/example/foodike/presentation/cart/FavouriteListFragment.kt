package com.example.foodike.presentation.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodike.data.data_source.FakeData
import com.example.foodike.databinding.FragmentFavouriteListBinding
import com.example.foodike.presentation.food.FoodItemAdapter
import com.example.foodike.presentation.food.VerticalSpaceItemDecoration

class FavouriteListFragment : Fragment() {

    private lateinit var binding: FragmentFavouriteListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavouriteListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = FoodItemAdapter(onFoodItemClick = {}).apply {
                addFoodItems(FakeData.favouriteItemList)
            }
            addItemDecoration(VerticalSpaceItemDecoration(48))
            setHasFixedSize(true)
        }

        binding.backbuttonCart.setOnClickListener {
            activity?.finish()
        }
    }

}


