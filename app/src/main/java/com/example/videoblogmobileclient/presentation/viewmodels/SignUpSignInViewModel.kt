package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import com.example.videoblogmobileclient.utils.Constants.LOG_TAG
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import javax.inject.Inject

class SignUpSignInViewModel @Inject constructor(): BaseViewModel() {

    init {
        Log.d(LOG_TAG, "vmCreated")
    }

    /*fun fetchData() {
        val service = retrofit.create(VideoBlogApiService::class.java)

        service.getUsers()
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                for (user in it) {
                    Log.d(LOG_TAG, user.name)
                }
            }, {
                Log.d(LOG_TAG, it.message.toString())
            })
    }*/
}