package com.example.videoblogmobileclient.data.models.user

import com.google.gson.annotations.SerializedName

data class RegisterUserModel(
    @SerializedName("userName") val login: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("confirmPassword") val confirmPassword: String
)