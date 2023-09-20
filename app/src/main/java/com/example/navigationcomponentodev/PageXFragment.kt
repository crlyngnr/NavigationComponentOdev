package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentodev.databinding.FragmentPageXBinding
import com.example.navigationcomponentodev.databinding.FragmentPageYBinding
import com.google.android.material.snackbar.Snackbar


class PageXFragment : Fragment() {
    private lateinit var binding : FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageXBinding.inflate(inflater,container,false)
        binding.button3.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.fragmentYGecis)
        }

    return binding.root
}

}