package com.example.videoblogmobileclient.di

import android.app.Application
import com.example.videoblogmobileclient.app.App
import com.example.videoblogmobileclient.data.di.DataComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    ViewModelModule::class,
    FragmentBindingModule::class,
    ActivityBindingModule::class
],
    dependencies = [DataComponent::class]
)
interface ApplicationComponent: AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun dataComponent(dataComponent: DataComponent): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }

}