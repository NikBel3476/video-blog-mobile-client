package com.example.videoblogmobileclient.data.models

import com.example.videoblogmobileclient.data.models.user.GetUserModel

data class VideotapeContent(
    val contentId: Int,
    val author: GetUserModel,
    val textContent: String?,
    val contentUri: String?,
    val date: Long,
    val likesCount: Int,
    val commentsCount: Int
)