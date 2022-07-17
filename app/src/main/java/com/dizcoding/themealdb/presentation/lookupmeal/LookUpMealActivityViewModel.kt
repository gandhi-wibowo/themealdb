package com.dizcoding.themealdb.presentation.lookupmeal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dizcoding.themealdb.domain.remote.usecase.LookUpMealUseCase
import com.dizcoding.themealdb.presentation.base.BaseViewModel

class LookUpMealActivityViewModel(
    private val lookUpMealUseCase: LookUpMealUseCase
) : BaseViewModel() {

    private val _items: MutableLiveData<MutableList<Any>> = MutableLiveData()
    fun items(): LiveData<MutableList<Any>> = _items

    fun getMealDetails(mealId: String) {
        _loadingState.postValue(true)
        lookUpMealUseCase.execute(hashMapOf("i" to mealId)).subscribe({
            _items.postValue(it)
            _loadingState.postValue(false)
        }, {
            _items.postValue(mutableListOf())
            _loadingState.postValue(false)
        }).collect()
    }
}