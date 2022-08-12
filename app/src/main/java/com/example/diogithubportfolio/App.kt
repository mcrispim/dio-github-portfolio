package com.example.diogithubportfolio

import android.app.Application
import com.example.diogithubportfolio.data.di.DataModule
import com.example.diogithubportfolio.domain.di.DomainModule
import com.example.diogithubportfolio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }

}