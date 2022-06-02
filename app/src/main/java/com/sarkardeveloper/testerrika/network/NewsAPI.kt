package com.sarkardeveloper.testerrika.network

import com.sarkardeveloper.testerrika.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "ru",
        @Query("apiKey") apiKey: String
    ): NewsModel
}