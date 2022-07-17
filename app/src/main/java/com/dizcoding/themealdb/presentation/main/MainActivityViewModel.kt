package com.dizcoding.themealdb.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dizcoding.themealdb.domain.remote.usecase.FindMealUseCase
import com.dizcoding.themealdb.presentation.base.BaseViewModel
import com.dizcoding.themealdb.presentation.main.adapter.items.holder.MainSearchResultData

class MainActivityViewModel(
    private val findMealUseCase: FindMealUseCase
) : BaseViewModel() {

    private val mainItems: MutableList<Any> = mutableListOf()
    private val _items: MutableLiveData<MutableList<Any>> = MutableLiveData()
    fun items(): LiveData<MutableList<Any>> = _items

    init {
        findMeal()
    }

    fun findMeal(keyword: String = "Seafood") {
        _loadingState.postValue(true)
        mainItems.clear()
        mainItems.add(keyword)
        findMealUseCase.execute(hashMapOf("c" to keyword)).subscribe({
            mainItems.add(MainSearchResultData(it))
            _items.postValue(mainItems)
            _loadingState.postValue(false)
        }, {
            mainItems.add(MainSearchResultData())
            _items.postValue(mainItems)
            _loadingState.postValue(false)
        }).collect()
    }
}