package com.example.group5project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.group5project.databinding.FragmentAthmBinding
import com.example.group5project.databinding.FragmentWelcomeBinding


class AthmFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAthmBinding>(
            inflater,
            R.layout.fragment_athm,
            container,
            false
        )
        binding.optionJblack.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.nike.com/ph/t/air-jordan-1-mid-shoes-SQf7DM/DQ8426-060")

            startActivity(openURL)

        }
        binding.optionOice.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.underarmour.com.ph/en-ph/p/men-footwear/mens_ua_hovr_phantom_3_reflect_running_shoes/3025518.html?dwvar_3025518_color=003&start=undefined&breadCrumbLast=undefined")

            startActivity(openURL)

        }
        binding.optionInv.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.nike.com/ph/t/invincible-3-road-running-shoes-VZDSsw/DR2660-002")

            startActivity(openURL)

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


