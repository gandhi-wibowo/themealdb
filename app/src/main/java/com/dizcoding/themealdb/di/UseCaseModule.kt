package com.dizcoding.themealdb.di

import com.dizcoding.themealdb.domain.remote.usecase.FindMealUseCase
import com.dizcoding.themealdb.domain.remote.usecase.LookUpMealUseCase
import org.koin.dsl.module


val useCaseModule = module {
    single { FindMealUseCase(get()) }
    single { LookUpMealUseCase(get()) }
}