package com.sarkardeveloper.testerrika

import android.content.Context
import com.sarkardeveloper.testerrika.providers.NewsProvider
import com.sarkardeveloper.testerrika.providers.NewsProviderHolder

object Singletons {
    private lateinit var appContext: Context

    private val sourcesProvider: NewsProvider by lazy {
        NewsProviderHolder.sourcesProvider
    }

    // -- Sources

    private val stationsSource: NewsSource by lazy {
        sourcesProvider.getNewsSource()
    }


    // -- Repositories

    val stationsRepository: NewsRepository by lazy {
        NewsRepository(stationsSource)
    }

    /**
     * Call this method in all application components that may be created at app startup/restoring
     * (e.g. in onCreate of activities and services)
     */
    fun init(appContext: Context) {
        Singletons.appContext = appContext
    }
}