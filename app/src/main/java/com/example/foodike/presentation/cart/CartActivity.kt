package com.example.foodike.presentation.cart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.foodike.R
import com.example.foodike.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemId = intent.getIntExtra("itemId", 0)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<AddToCartFragment>(R.id.fragment_container_view, args = Bundle().apply {
                    putInt("itemId",itemId)
                })
            }
        }
    }

}