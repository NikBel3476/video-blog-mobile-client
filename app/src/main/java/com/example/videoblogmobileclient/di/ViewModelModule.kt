package com.example.videoblogmobileclient.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.videoblogmobileclient.base.BaseViewModelFactory
import com.example.videoblogmobileclient.presentation.viewmodels.RegisterViewModel
import com.example.videoblogmobileclient.presentation.viewmodels.SignUpSignInViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    //Factory
    @Binds
    internal abstract fun bindViewModelFactory(factory: BaseViewModelFactory): ViewModelProvider.Factory

    //ViewModels
    @Binds
    @IntoMap
    @ViewModelKey(SignUpSignInViewModel::class)
    internal abstract fun bindSignUpSignInViewModel(signInViewModel: SignUpSignInViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RegisterViewModel::class)
    internal abstract fun bindRegisterViewModel(registerViewModel: RegisterViewModel): ViewModel

}