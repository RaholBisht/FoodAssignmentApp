package com.example.foodike.presentation.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodike.databinding.FragmentLoginTabBinding
import com.example.foodike.presentation.bottomnavigation.BottomNavigation

class LoginTabFragment : Fragment() {

    private lateinit var binding: FragmentLoginTabBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginTabBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLogin.setOnClickListener {
            requireContext().startActivity(Intent(activity, BottomNavigation::class.java))
        }
    }

}

