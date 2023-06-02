package com.example.group5project

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.group5project.databinding.FragmentCategoryBinding
import com.example.group5project.databinding.FragmentWelcomeBinding

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentCategoryBinding>(inflater, R.layout.fragment_category, container, false)
        binding.optionAthletic.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_categoryFragment_to_athmFragment)
        }
        binding.optionLifestyle.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_categoryFragment_to_lifestyleFragment)
        }
        binding.optionSlip.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_categoryFragment_to_slipFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}