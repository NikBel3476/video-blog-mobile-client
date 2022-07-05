package com.example.videoblogmobileclient.di

import android.app.Application
import android.text.style.BulletSpan
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.presentation.fragments.*
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    NetworkModule::class,
    ViewModelModule::class
])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }
    //App
    fun inject(app: App)

    //Fragments
    fun inject(fragment: SignUpSingInFragment)
    fun inject(fragment: RegisterFragment)
}