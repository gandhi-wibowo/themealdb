package com.dizcoding.themealdb.data.remote.response

import com.google.gson.annotations.SerializedName

data class MealsDataResponse(
    @SerializedName("strMeal") val strMeal: String?,
    @SerializedName("strMealThumb") val strMealThumb: String?,
    @SerializedName("idMeal") val idMeal: String?
)