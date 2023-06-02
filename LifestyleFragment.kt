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
import com.example.group5project.databinding.FragmentLifestyleBinding
import com.example.group5project.databinding.FragmentWelcomeBinding


class LifestyleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLifestyleBinding>(
            inflater,
            R.layout.fragment_lifestyle,
            container,
            false
        )
        binding.optionDunk.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.nike.com/ph/t/dunk-low-retro-shoes-69h36X/DV0831-002")

            startActivity(openURL)

        }
        binding.optionThera.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.nike.com/ph/t/tech-hera-shoes-JlV5km/DR9761-001")

            startActivity(openURL)

        }
        binding.optionStar.setOnClickListener {


            val openURL = Intent(android.content.Intent.ACTION_VIEW)

            openURL.data = Uri.parse("https://www.adidas.com.ph/superstar-shoes/EG4960.html")

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


