package com.example.group5project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.group5project.R
import com.example.group5project.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home,container, false)

        binding.btnLogin.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_welcomeFragment)
        }

        binding.btnRegister.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_registerFragment)

        }

        return binding.root
    }

}