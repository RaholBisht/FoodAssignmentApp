package com.example.foodike.presentation.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodike.R
import com.example.foodike.databinding.LayoutCartItemImageCarouselBinding


class ItemCarouselAdapter() : RecyclerView.Adapter<ItemCarouselAdapter.ViewHolder>() {
    class ViewHolder(val binding: LayoutCartItemImageCarouselBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutCartItemImageCarouselBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.apply {
                 imageViewMenuItem.setBackgroundResource(R.drawable.applepie)
            }
        }
    }
    override fun getItemCount() = 5
}