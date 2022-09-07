package com.example.videoblogmobileclient.data.models

import com.google.gson.annotations.SerializedName

data class ResponseExample (
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("refreshToken") val refreshToken: String
)