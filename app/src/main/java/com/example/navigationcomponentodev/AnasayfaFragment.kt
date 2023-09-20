package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentodev.databinding.FragmentPageYBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.button5.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.fragmentXGecis)
        }
        binding.button6.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.fragmentAGecis)
        }


        return binding.root
    }

}