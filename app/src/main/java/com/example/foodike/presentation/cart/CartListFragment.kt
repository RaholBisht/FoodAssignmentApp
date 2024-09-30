package com.example.foodike.presentation.cart

import ViewCartAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodike.data.data_source.FakeData
import com.example.foodike.databinding.FragmentViewCartBinding
import com.example.foodike.presentation.food.VerticalSpaceItemDecoration

class CartListFragment : Fragment() {


    private lateinit var binding: FragmentViewCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewCart.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ViewCartAdapter(FakeData.cartItemList)
            addItemDecoration(VerticalSpaceItemDecoration(48))
            setHasFixedSize(true)
        }
    }

}


