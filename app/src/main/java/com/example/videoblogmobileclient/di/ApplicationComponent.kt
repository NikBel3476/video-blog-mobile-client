package com.example.videoblogmobileclient.di

import com.example.videoblogmobileclient.presentation.fragments.*
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    //Fragments
    fun inject(fragment: SignUpSingInFragment)
}