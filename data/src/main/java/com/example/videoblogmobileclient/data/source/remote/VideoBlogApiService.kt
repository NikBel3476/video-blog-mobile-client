package com.example.videoblogmobileclient.data.source.remote

import com.example.videoblogmobileclient.data.models.ResponseExample
import com.example.videoblogmobileclient.data.models.user.RegisterUserModel
import retrofit2.http.Body
import retrofit2.http.POST

interface VideoBlogApiService {

    @POST("account/registration")
    suspend fun register(@Body user: RegisterUserModel): ResponseExample

    @POST("account/login")
    fun singIn()

    // TODO: wait fot server features
    @POST("")
    fun logout()
}