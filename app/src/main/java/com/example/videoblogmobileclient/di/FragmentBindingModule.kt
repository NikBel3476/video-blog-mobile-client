package com.example.videoblogmobileclient.di

import com.example.videoblogmobileclient.presentation.fragments.SignUpSignInFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {
    @ContributesAndroidInjector
    abstract fun signUpSignInFragment(): SignUpSignInFragment
}