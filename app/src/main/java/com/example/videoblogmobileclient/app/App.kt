package com.example.videoblogmobileclient.app

import android.app.Application
import com.example.videoblogmobileclient.di.ApplicationComponent
import com.example.videoblogmobileclient.di.DaggerApplicationComponent

class App: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
            .builder()
            .build()
    }
}