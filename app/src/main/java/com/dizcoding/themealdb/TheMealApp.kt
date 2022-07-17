package com.dizcoding.themealdb

import android.app.Application
import com.dizcoding.themealdb.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class TheMealApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@TheMealApp)
            modules(
                listOf(
                    okHttpModule,
                    apiModule,
                    dataModule,
                    viewModelModule,
                    useCaseModule
                )
            )
        }
    }
}