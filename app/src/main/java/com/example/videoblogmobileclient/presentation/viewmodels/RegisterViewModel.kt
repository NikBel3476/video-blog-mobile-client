package com.example.videoblogmobileclient.presentation.viewmodels

import android.provider.ContactsContract
import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.models.ResponseExample
import com.example.videoblogmobileclient.data.models.User
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import com.example.videoblogmobileclient.utilities.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.awaitResponse
import javax.inject.Inject

class RegisterViewModel @Inject constructor(private val service: VideoBlogApiService): BaseViewModel() {

    fun registerUser(
        login: String,
        email: String,
        password: String,
        confirmPassword: String
    ) {
        val user = User(login = login, email = email, password = password, confirmPassword = confirmPassword)
        Log.d(Constants.LOG_TAG, "User ${user.login} created.")
        service.register(user).enqueue(object: Callback<ResponseExample> {
            override fun onResponse(call: Call<ResponseExample>, response: Response<ResponseExample>) {
                val userResp = response.body()
                Log.d(Constants.LOG_TAG, "Token ${userResp?.accessToken}.")
            }

            override fun onFailure(call: Call<ResponseExample>, t: Throwable) {

            }
        })
    }

}