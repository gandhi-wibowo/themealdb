package com.dizcoding.themealdb.di

import com.dizcoding.themealdb.data.remote.ITheMealDbRepository
import com.dizcoding.themealdb.domain.remote.TheMealDbRepository
import org.koin.dsl.module

val dataModule = module {
    single<TheMealDbRepository> { ITheMealDbRepository(get())  }
}