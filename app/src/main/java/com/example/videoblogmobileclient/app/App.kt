package com.example.videoblogmobileclient.app

import android.app.Application
import com.example.videoblogmobileclient.data.di.DaggerDataComponent
import com.example.videoblogmobileclient.data.di.DataComponent
import com.example.videoblogmobileclient.di.ApplicationComponent
import com.example.videoblogmobileclient.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App: Application(), HasAndroidInjector{
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()

        val applicationComponent = DaggerApplicationComponent
            .builder()
            .application(this)
            .dataComponent(provideDataComponent())
            .build()

        applicationComponent.inject(this)
    }

    private fun provideDataComponent(): DataComponent {
        return DaggerDataComponent
            .builder()
            .build()
    }
}