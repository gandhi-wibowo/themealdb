package com.dizcoding.themealdb.domain.remote

import com.dizcoding.themealdb.data.remote.response.MealsDetailResponse
import com.dizcoding.themealdb.data.remote.response.MealsResponse
import io.reactivex.Single

interface TheMealDbRepository {
    fun findMeal(params: HashMap<String, String>): Single<MealsResponse>
    fun lookUpMeal(params: HashMap<String, String>): Single<MealsDetailResponse>
}