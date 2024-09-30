package com.example.foodike.presentation.food

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.foodike.databinding.ItemMenuBinding
import com.example.foodike.domain.model.FoodItem

class FoodItemAdapter(val onFoodItemClick: (FoodItem) -> Unit) :
    ListAdapter<FoodItem, FoodItemAdapter.FoodItemViewHolder>(DIFF_CALLBACK) {
    fun addFoodItems(foodItemList: List<FoodItem>) {
        submitList(foodItemList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val binding = ItemMenuBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        holder.bind(getItem(position), onFoodItemClick = onFoodItemClick)
    }

    inner class FoodItemViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(foodItem: FoodItem, onFoodItemClick: (FoodItem) -> Unit) {
            binding.apply {
                foodItem.apply {
                    textViewMenuItemName.text = name
                    textViewMenuItemPrice.text = price.toString()
                    textViewMenuItemIngredients.text = foodItem.ingredient
                    textViewMenuItemDeliveryTime.text = foodItem.distance
                    textViewMenuItemRatingInfo.text = foodItem.itemRatingInfo
                }
            }
            itemView.setOnClickListener {
                onFoodItemClick.invoke(foodItem)
            }
        }
    }
}

val DIFF_CALLBACK: DiffUtil.ItemCallback<FoodItem> = object : DiffUtil.ItemCallback<FoodItem>() {
    override fun areItemsTheSame(
        oldFoodItem: FoodItem, newFoodItem: FoodItem
    ): Boolean {
        return oldFoodItem.itemId == newFoodItem.itemId
    }

    override fun areContentsTheSame(
        oldFoodItem: FoodItem, newFoodItem: FoodItem
    ): Boolean {
        return oldFoodItem == newFoodItem
    }
}
