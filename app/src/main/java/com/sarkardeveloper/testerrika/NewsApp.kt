package com.sarkardeveloper.testerrika

import android.app.Application
import com.sarkardeveloper.testerrika.di.AppComponent
import com.sarkardeveloper.testerrika.di.DaggerAppComponent

open class NewsApp : Application() {

    open val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

}