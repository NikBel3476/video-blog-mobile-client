package com.example.videoblogmobileclient.data.source.remote

import com.example.videoblogmobileclient.data.models.ResponseExample
import com.example.videoblogmobileclient.data.models.User
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface VideoBlogApiService {

    // TODO: delete this method 
    @GET("users")
    fun getUsers(): Single<List<User>>

    @POST("account/registration")
    fun register(@Body user: User): Call<ResponseExample>

    @POST("account/login")
    fun singIn()

    // TODO: wait fot server features
    @POST("")
    fun logout()
}