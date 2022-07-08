package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.utilities.Constants
import javax.inject.Inject

class RegisterViewModel @Inject constructor(): BaseViewModel() {

    init {
        Log.d(Constants.LOG_TAG, "RegisterViewModel is Created")
    }

}