package com.example.videoblogmobileclient.presentation.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.databinding.FragmentSignUpSingInBinding
import com.example.videoblogmobileclient.helpers.injectViewModel
import com.example.videoblogmobileclient.presentation.viewmodels.SignUpSignInViewModel
import com.example.videoblogmobileclient.utils.Constants.LOG_TAG
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SignUpSignInFragment : Fragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: SignUpSignInViewModel
    lateinit var binding: FragmentSignUpSingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        Log.d(LOG_TAG, "susi fragment created")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpSingInBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = injectViewModel(viewModelFactory)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel.fetchData()
        binding.registerBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signUpSignInFragment_to_registerFragment)
        }

        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpSignInFragment_to_loginFragment)
        }
    }
}