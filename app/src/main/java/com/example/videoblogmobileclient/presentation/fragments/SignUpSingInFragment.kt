package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.videoblogmobileclient.databinding.FragmentSignUpSingInBinding

class SignUpSingInFragment : Fragment() {
    lateinit var binding: FragmentSignUpSingInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpSingInBinding.inflate(inflater)
        return binding.root
    }
}