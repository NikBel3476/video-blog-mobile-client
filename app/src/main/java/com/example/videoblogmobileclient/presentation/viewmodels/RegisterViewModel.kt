package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.models.User
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import com.example.videoblogmobileclient.utilities.Constants
import javax.inject.Inject

class RegisterViewModel @Inject constructor(private val service: VideoBlogApiService): BaseViewModel() {

    fun registerUser(
        login: String,
        email: String,
        password: String
    ) {
        val user = User(login = login, email = email, password = password)
        Log.d(Constants.LOG_TAG, "User ${user.login} created.")
    }

}