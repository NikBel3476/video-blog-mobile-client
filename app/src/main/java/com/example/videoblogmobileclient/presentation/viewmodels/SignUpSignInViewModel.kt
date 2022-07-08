package com.example.videoblogmobileclient.presentation.viewmodels

import android.util.Log
import com.example.videoblogmobileclient.base.BaseViewModel
import com.example.videoblogmobileclient.utilities.Constants.LOG_TAG
import javax.inject.Inject

class SignUpSignInViewModel @Inject constructor(): BaseViewModel() {

    init {
        Log.d(LOG_TAG, "susi vmCreated")
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