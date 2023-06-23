package com.sarkardeveloper.testerrika.di.module

import com.sarkardeveloper.testerrika.NewsSource
import com.sarkardeveloper.testerrika.network.RetrofitNewsSource
import dagger.Binds
import dagger.Module

@Module
abstract class NewsSourceModule {

    @Binds
    abstract fun provideNewsSource(retrofitNewsSource: RetrofitNewsSource): NewsSource

}