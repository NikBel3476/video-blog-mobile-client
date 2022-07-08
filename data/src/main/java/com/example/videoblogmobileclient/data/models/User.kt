package com.example.videoblogmobileclient.data.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("login") val login: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)