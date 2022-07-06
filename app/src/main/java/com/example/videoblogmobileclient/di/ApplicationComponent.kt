package com.example.videoblogmobileclient.di

import android.app.Application
import android.text.style.BulletSpan
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.base.BaseViewModelFactory
import com.example.videoblogmobileclient.presentation.fragments.*
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NetworkModule::class,
    ViewModelModule::class
])
interface ApplicationComponent {

    val factory: BaseViewModelFactory

    //App
    fun inject(app: App)

    //Fragments
    fun inject(fragment: SignUpSingInFragment)
    fun inject(fragment: RegisterFragment)
}