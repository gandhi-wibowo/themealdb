package com.dizcoding.themealdb.data.remote.response

import com.google.gson.annotations.SerializedName

data class MealsDetailResponse(@SerializedName("meals") val meals: MutableList<MealsDetailDataResponse>? = null)