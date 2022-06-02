package com.sarkardeveloper.testerrika.providers

import com.sarkardeveloper.testerrika.NewsSource

interface NewsProvider {
    fun getNewsSource(): NewsSource
}