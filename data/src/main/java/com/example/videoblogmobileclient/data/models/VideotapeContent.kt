package com.example.videoblogmobileclient.data.models

import java.util.*

data class VideotapeContent(
    val id: Int,
    val text_content: String,
    val date: Date,
    val author: User,
    // TODO: Change content uri type to String
    val content_uri: Int,
    val author_icon: Int
)