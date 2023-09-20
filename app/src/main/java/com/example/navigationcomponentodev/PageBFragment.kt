package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentodev.databinding.FragmentPageBBinding
import com.example.navigationcomponentodev.databinding.FragmentPageYBinding
import com.google.android.material.snackbar.Snackbar

class PageBFragment : Fragment() {
    private lateinit var binding : FragmentPageBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageBBinding.inflate(inflater,container,false)
        binding.button2.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.fragmentYGeciss)
        }

        return binding.root
    }
}