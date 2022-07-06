package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.databinding.FragmentRegisterBinding
import com.example.videoblogmobileclient.presentation.viewmodels.RegisterViewModel
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import com.example.videoblogmobileclient.utils.Constants
import javax.inject.Inject

class RegisterFragment : Fragment() {
    private lateinit var viewModel: RegisterViewModel
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (this.activity?.applicationContext as App).applicationComponent.inject(this@RegisterFragment)
        Log.d(Constants.LOG_TAG, "register fragment created")
        viewModel = (this.activity?.applicationContext as App).applicationComponent.factory.create(RegisterViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }
}