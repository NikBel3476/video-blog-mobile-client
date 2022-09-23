package com.example.videoblogmobileclient.data.models.user

data class GetUserModel(
    val userId: Int,
    val userName: String,
    val userIconUri: String
)