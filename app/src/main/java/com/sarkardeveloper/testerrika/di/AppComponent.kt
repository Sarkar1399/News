package com.sarkardeveloper.testerrika.di

import android.content.Context
import com.sarkardeveloper.testerrika.MainActivity
import com.sarkardeveloper.testerrika.di.module.APIModule
import com.sarkardeveloper.testerrika.di.module.NewsModule
import com.sarkardeveloper.testerrika.di.module.NewsSourceModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NewsModule::class, NewsSourceModule::class, APIModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity:MainActivity)
}