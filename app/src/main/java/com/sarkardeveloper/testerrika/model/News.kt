package com.sarkardeveloper.testerrika.model

data class News(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val content: String
)
