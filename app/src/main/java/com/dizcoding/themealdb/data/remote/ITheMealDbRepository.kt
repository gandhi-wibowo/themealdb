package com.dizcoding.themealdb.data.remote

import com.dizcoding.themealdb.data.remote.response.MealsDetailResponse
import com.dizcoding.themealdb.data.remote.response.MealsResponse
import com.dizcoding.themealdb.domain.remote.TheMealDbRepository
import io.reactivex.Single

class ITheMealDbRepository(private val api: TheMealDbApi) : TheMealDbRepository{
    override fun findMeal(params: HashMap<String, String>): Single<MealsResponse> {
        return api.findMeal(params)
    }

    override fun lookUpMeal(params: HashMap<String, String>): Single<MealsDetailResponse> {
        return api.lookUpMeal(params)
    }
}