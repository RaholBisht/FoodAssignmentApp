package com.example.foodike.presentation.cart

import ViewCartAdapter
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.foodike.R
import com.example.foodike.databinding.FragmentViewCartBinding

class ViewCart : AppCompatActivity() {
    private lateinit var binding: FragmentViewCartBinding
    private lateinit var adapter: ViewCartAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_view_cart)


        binding = FragmentViewCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbuttonCart.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finish()
            }

        })
    }
}