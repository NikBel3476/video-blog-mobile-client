package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.databinding.FragmentSignUpSingInBinding
import com.example.videoblogmobileclient.presentation.factories.SingUpSingInViewModelFactory
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import com.example.videoblogmobileclient.utils.Constants.LOG_TAG
import javax.inject.Inject

class SignUpSingInFragment : Fragment() {
    @Inject
    lateinit var vmFactory: SingUpSingInViewModelFactory

    private lateinit var viewModel: SingUpSingInViewModel
    lateinit var binding: FragmentSignUpSingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (this.activity?.applicationContext as App).applicationComponent.inject(this@SignUpSingInFragment)

        viewModel = ViewModelProvider(this, vmFactory)
            .get(SingUpSingInViewModel::class.java)

        Log.d(LOG_TAG, "fragment created")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpSingInBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel.fetchData()
        binding.registerBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signUpSingInFragment_to_registerFragment)
        }

        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpSingInFragment_to_loginFragment)
        }
    }
}