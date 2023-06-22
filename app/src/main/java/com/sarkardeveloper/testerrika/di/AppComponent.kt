package com.sarkardeveloper.testerrika.di

import android.content.Context
import com.sarkardeveloper.testerrika.MainActivity
import com.sarkardeveloper.testerrika.di.module.NewsModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [NewsModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity:MainActivity)
}