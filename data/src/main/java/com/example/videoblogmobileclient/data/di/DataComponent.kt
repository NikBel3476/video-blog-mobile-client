package com.example.videoblogmobileclient.data.di

import com.example.videoblogmobileclient.data.source.remote.VideoBlogApiService
import dagger.Component

@Component(modules = [NetworkModule::class])
interface DataComponent {

    fun getVideoBlogApiService(): VideoBlogApiService

    @Component.Builder
    interface Builder {
        fun build(): DataComponent
    }
}