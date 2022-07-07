package com.example.videoblogmobileclient.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException
import javax.inject.Inject
import javax.inject.Provider

class BaseViewModelFactory @Inject constructor(private val viewModels: MutableMap<Class<out ViewModel>,
        Provider<ViewModel>>) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModelProvider = viewModels[modelClass]
            ?: throw IllegalArgumentException("This view model class is not created")

        return viewModelProvider.get() as T
    }
}