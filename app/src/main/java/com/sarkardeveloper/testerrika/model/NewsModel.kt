package com.sarkardeveloper.testerrika.model

data class NewsModel(
    val status: String,
    val totalResults: Long,
    val articles: List<News>
)