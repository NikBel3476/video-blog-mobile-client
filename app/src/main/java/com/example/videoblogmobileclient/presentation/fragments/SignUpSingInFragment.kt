package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.databinding.FragmentSignUpSingInBinding
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import javax.inject.Inject

class SignUpSingInFragment : Fragment() {

    @Inject
    lateinit var viewModel: SingUpSingInViewModel
    lateinit var binding: FragmentSignUpSingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (this.activity?.applicationContext as App).applicationComponent.inject(this@SignUpSingInFragment)
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
        viewModel.fetchData()
        binding.registerBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signUpSingInFragment_to_registerFragment)
        }

        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpSingInFragment_to_loginFragment)
        }
    }
}