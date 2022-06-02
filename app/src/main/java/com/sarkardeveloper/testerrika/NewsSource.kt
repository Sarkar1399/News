package com.sarkardeveloper.testerrika

import com.sarkardeveloper.testerrika.model.NewsModel

interface NewsSource {
    suspend fun getNews(): NewsModel
}