package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentodev.databinding.FragmentPageABinding
import com.example.navigationcomponentodev.databinding.FragmentPageYBinding
import com.google.android.material.snackbar.Snackbar


class PageAFragment : Fragment() {
    private lateinit var binding : FragmentPageABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageABinding.inflate(inflater,container,false)

        binding.button.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.fragmentBGecis)
        }
    return binding.root
}

}