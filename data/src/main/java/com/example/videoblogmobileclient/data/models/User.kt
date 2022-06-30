package com.example.videoblogmobileclient.data.models

import com.google.gson.annotations.SerializedName

// TODO: add email field
data class User(
    @SerializedName("login") val login: String,
    @SerializedName("name") val name: String,
    @SerializedName("password") val token: String
)