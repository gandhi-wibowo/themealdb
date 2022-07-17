package com.dizcoding.themealdb.data.remote.response

import com.google.gson.annotations.SerializedName

data class MealsResponse(@SerializedName("meals") val meals: MutableList<MealsDataResponse>? = null)