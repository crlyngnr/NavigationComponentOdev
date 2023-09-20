package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.FragmentManager
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentodev.databinding.FragmentPageYBinding
import com.google.android.material.snackbar.Snackbar

class PageYFragment : Fragment() {
    private lateinit var binding : FragmentPageYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageYBinding.inflate(inflater,container,false)
    val backPress = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
                    findNavController().navigate(R.id.fragmentAnasayfaGecis)
        }
    }
    requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)
    return binding.root
}
}