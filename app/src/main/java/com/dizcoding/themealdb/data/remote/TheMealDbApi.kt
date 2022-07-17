package com.dizcoding.themealdb.data.remote

import com.dizcoding.themealdb.data.remote.response.MealsDetailResponse
import com.dizcoding.themealdb.data.remote.response.MealsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface TheMealDbApi {
    /*Find Meal
    * Filter by "c as Category"
    * ex c=Seafood*/
    @GET(TheMealDbEndpoint.FIND_MEAL)
    fun findMeal(@QueryMap params: HashMap<String, String>): Single<MealsResponse>

    /*Look Up Meal
    * i as MealId
    * ex : i=12345*/
    @GET(TheMealDbEndpoint.LOOKUP_MEAL)
    fun lookUpMeal(@QueryMap params: HashMap<String, String>): Single<MealsDetailResponse>
}