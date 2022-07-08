package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.databinding.FragmentWrapperBinding
import com.example.videoblogmobileclient.utilities.Constants

class WrapperFragment : Fragment() {
    lateinit var binding: FragmentWrapperBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWrapperBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            findNavController().navigate(R.id.action_wrapperFragment_to_signUpSignInFragment)
        }, com.example.videoblogmobileclient.utilities.Constants.WRAPPER_TIME)
    }
}