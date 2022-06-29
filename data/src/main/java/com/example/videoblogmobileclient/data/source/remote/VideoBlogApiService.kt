package com.example.videoblogmobileclient.data.source.remote

import retrofit2.http.POST

interface VideoBlogApiService {

    @POST("")
    fun register()

    @POST("")
    fun singIn()

    @POST("")
    fun logout()
}