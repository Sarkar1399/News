package com.sarkardeveloper.testerrika

import com.sarkardeveloper.testerrika.model.NewsModel

class NewsRepository(
    private val stationsSource: NewsSource
) {
    suspend fun getNews(): NewsModel = stationsSource.getNews()
}