package com.example.videoblogmobileclient.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.videoblogmobileclient.base.BaseViewModelFactory
import com.example.videoblogmobileclient.di.annotations.ViewModelKey
import com.example.videoblogmobileclient.presentation.viewmodels.RegisterViewModel
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @[IntoMap ViewModelKey(SingUpSingInViewModel::class)]
    fun bindSingUpSingInViewModel(viewModel: SingUpSingInViewModel): ViewModel

    @Binds
    @[IntoMap ViewModelKey(RegisterViewModel::class)]
    fun bindRegisterViewModel(viewModel: RegisterViewModel): ViewModel
}