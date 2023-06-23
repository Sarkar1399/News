package com.sarkardeveloper.testerrika.providers

import com.sarkardeveloper.testerrika.NewsSource
import com.sarkardeveloper.testerrika.network.RetrofitNewsSource
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitSourcesProvider @Inject constructor(
    private val retrofit: Retrofit
) : NewsProvider {
    override fun getNewsSource(): NewsSource {
        return RetrofitNewsSource(retrofit)
    }

}