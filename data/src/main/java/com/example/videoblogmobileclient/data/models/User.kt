package com.example.videoblogmobileclient.data.models

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userName") val login: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("confirmPassword") val confirmPassword: String
)