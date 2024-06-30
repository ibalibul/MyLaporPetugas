package com.example.mylaporpetugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mylaporpetugas.databinding.FragmentProfileDesaBinding


class ProfileDesaFragment : Fragment() {

    lateinit var binding : FragmentProfileDesaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileDesaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbarBpDesa.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_profileDesaFragment_to_homeFragment)
        }

    }


}