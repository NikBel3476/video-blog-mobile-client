package com.example.videoblogmobileclient.di

import com.example.videoblogmobileclient.presentation.fragments.*
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    //Fragments
    fun inject(fragment: SignUpSingInFragment)
}