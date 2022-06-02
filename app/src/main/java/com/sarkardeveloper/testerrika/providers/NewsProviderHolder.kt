package com.sarkardeveloper.testerrika.providers

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object NewsProviderHolder {
    val sourcesProvider: NewsProvider by lazy<NewsProvider> {
        val moshi = Moshi.Builder().build()
        val config = createRetrofit(moshi)

        RetrofitSourcesProvider(config)
    }

    private fun createRetrofit(moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

}