package com.example.foodike.presentation.bottomnavigation

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.foodike.presentation.food.FavouriteFragment

class FoodMenuViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val tabTitleList = listOf("Foods","Drinks","Snacks","Sauce")
    override fun getItemCount(): Int {
        return 4
    }

    fun getTitle(position: Int): String {
        return tabTitleList.get(position)
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            FavouriteFragment()
        else
            FavouriteFragment()
    }
}