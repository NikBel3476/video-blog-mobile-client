package com.example.videoblogmobileclient.data.models

import java.util.*

data class VideotapeContent(
    val id: Int,
    val text_content: String,
    val date: Date,
    val author: User,
    val content_uri: String
)