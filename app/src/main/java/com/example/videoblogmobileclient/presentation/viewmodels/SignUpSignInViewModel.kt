package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import com.example.videoblogmobileclient.utilities.Constants.LOG_TAG
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SignUpSignInViewModel @Inject constructor(
    private val service: VideoBlogApiService
): BaseViewModel() {

}