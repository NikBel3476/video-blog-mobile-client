package com.example.videoblogmobileclient.presentation.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.videoblogmobileclient.presentation.viewmodels.SingUpSingInViewModel
import retrofit2.Retrofit

class SingUpSingInViewModelFactory(
    private val retrofit: Retrofit
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SingUpSingInViewModel(retrofit) as T
    }
}