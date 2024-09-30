package com.example.foodike.presentation.bottomnavigation.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.foodike.R
import com.example.foodike.databinding.FragmentHomeBinding
import com.example.foodike.presentation.bottomnavigation.FoodMenuViewPagerAdapter
import com.example.foodike.presentation.cart.ViewCartActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            val foodAdapter = FoodMenuViewPagerAdapter(this@HomeFragment)
            foodItemViewPager.adapter = foodAdapter

            TabLayoutMediator(foodItemTabLayout, foodItemViewPager) { tab, position ->
                tab.text = foodAdapter.getTitle(position)

            }.attach()

            buttonShoppingCart.setOnClickListener {
                Intent(activity, ViewCartActivity::class.java).apply {
                    requireContext().startActivity(this)
                }
            }
        }
    }

}