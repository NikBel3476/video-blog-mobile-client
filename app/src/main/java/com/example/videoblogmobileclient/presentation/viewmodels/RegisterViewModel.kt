package com.example.videoblogmobileclient.presentation.viewmodels

import androidx.lifecycle.viewModelScope
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.models.user.RegisterUserModel
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import kotlinx.coroutines.launch
import javax.inject.Inject

class RegisterViewModel @Inject constructor(private val service: VideoBlogApiService): BaseViewModel() {

    fun registerUser(
        login: String,
        email: String,
        password: String,
        confirmPassword: String
    ) {
        val user = RegisterUserModel(login = login, email = email, password = password, confirmPassword = confirmPassword)
        viewModelScope.launch {
            val response = service.register(user)
        }
    }

}