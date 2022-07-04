package com.example.videoblogmobileclient.di

import com.example.videoblogmobileclient.presentation.factories.SingUpSingInViewModelFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class FactoryModule {

    @Provides
    @Singleton
    fun provideSignUpSingInViewModelFactory(
        retrofit: Retrofit
    ): SingUpSingInViewModelFactory {
        return SingUpSingInViewModelFactory(retrofit)
    }
}