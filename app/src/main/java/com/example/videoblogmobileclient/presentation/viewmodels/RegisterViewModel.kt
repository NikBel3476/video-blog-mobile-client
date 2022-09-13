package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.models.User
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import com.example.videoblogmobileclient.data.utils.Constants.CHECK_TAG
import kotlinx.coroutines.launch
import javax.inject.Inject

class RegisterViewModel @Inject constructor(private val service: VideoBlogApiService): BaseViewModel() {

    fun registerUser(
        login: String,
        email: String,
        password: String,
        confirmPassword: String
    ) {
        val user = User(login = login, email = email, password = password, confirmPassword = confirmPassword)
        viewModelScope.launch {
            val response = service.register(user)
            Log.d(CHECK_TAG, response.accessToken)
        }
    }

}