package com.dizcoding.themealdb.di

import com.dizcoding.themealdb.presentation.lookupmeal.LookUpMealActivityViewModel
import com.dizcoding.themealdb.presentation.main.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
    viewModel { LookUpMealActivityViewModel(get()) }
}