package com.sarkardeveloper.testerrika

import com.sarkardeveloper.testerrika.model.NewsModel
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val stationsSource: NewsSource
) {
    suspend fun getNews(): NewsModel = stationsSource.getNews()
}