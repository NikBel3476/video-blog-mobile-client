package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.databinding.FragmentRegisterBinding
import com.example.videoblogmobileclient.helpers.injectViewModel
import com.example.videoblogmobileclient.presentation.viewmodels.RegisterViewModel
import com.example.videoblogmobileclient.utilities.Constants
import com.example.videoblogmobileclient.utilities.Constants.LOG_TAG
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject
import kotlin.math.log

class RegisterFragment : Fragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: RegisterViewModel
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        viewModel = injectViewModel(viewModelFactory)
        Log.d(LOG_TAG, "register fragment created")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        focusListeners()
        binding.registerBtn.setOnClickListener {
            submit()
        }
    }

    private fun submit() {
        if(validateLogin() == null && validateEmail() == null && validatePassword() == null)
            binding.apply {
                viewModel.registerUser(
                    login = loginEditText.text.toString(),
                    email = emailEditText.text.toString(),
                    password = passwordEditText.text.toString(),
                    confirmPassword = confirmPasswordEditText.text.toString()
                )
            }
    }

    private fun focusListeners() {
        binding.loginEditText.setOnFocusChangeListener { _, focused -> if(!focused) binding.loginContainer.helperText = validateLogin() }
        binding.emailEditText.setOnFocusChangeListener { _, focused -> if(!focused) binding.emailContainer.helperText = validateEmail() }
        binding.passwordEditText.setOnFocusChangeListener{ _, focused -> if(!focused) binding.passwordContainer.helperText = validatePassword() }
        binding.confirmPasswordEditText.setOnFocusChangeListener{ _, focused -> if(!focused) binding.confirmPasswordContainer.helperText = validateConfirmingPassword()}
    }

    private fun validateLogin(): String? {
        // TODO: Complete the method
        /*val login = binding.loginEditText.text.toString()
        if(login.length < 8)
            return R.string.warn_field_length.toString()
        else if(login.matches(".*[@#\$%^&+=].*".toRegex()))
            return R.string.warn_login_spec_char.toString()*/
        return null
    }

    private fun validateEmail(): String? {
        val emailText = binding.emailEditText.text.toString()
        if(!Patterns.EMAIL_ADDRESS.matcher(emailText).matches())
            return getString(R.string.warn_email)
        return null
    }

    private fun validatePassword(): String? {
        val password = binding.passwordEditText.text.toString()
        if(password.length < 6) {
            return getString(R.string.warn_field_length)
        } else if(!password.matches(".*[A-Z].*".toRegex())){
            return getString(R.string.warn_pas_upper_case)
        } else if(!password.matches(".*[a-z].*".toRegex()))
            return getString(R.string.warn_pas_lower_case)
        else if(!password.matches(".*[@#\$%^&+=_].*".toRegex()))
            return getString(R.string.warn_pas_spec_char)
        return null
    }

    private fun validateConfirmingPassword(): String? {
        if(binding.passwordEditText.text.toString() != binding.confirmPasswordEditText.text.toString())
            return getString(R.string.warn_confirm_password_mismatch)
        return null
    }
}