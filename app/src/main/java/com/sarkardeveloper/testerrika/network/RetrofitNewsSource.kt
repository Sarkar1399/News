package com.sarkardeveloper.testerrika.network

import com.sarkardeveloper.testerrika.BuildConfig
import com.sarkardeveloper.testerrika.NewsSource
import com.sarkardeveloper.testerrika.model.NewsModel
import retrofit2.Retrofit

class RetrofitNewsSource(retrofit: Retrofit) : NewsSource {

    private val newsApi = retrofit.create(NewsAPI::class.java)

    override suspend fun getNews(): NewsModel {
        return newsApi.getNews(apiKey = BuildConfig.API_KEY)
    }

}