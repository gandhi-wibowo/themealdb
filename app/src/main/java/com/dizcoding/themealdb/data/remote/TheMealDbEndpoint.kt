package com.dizcoding.themealdb.data.remote

import com.dizcoding.themealdb.BuildConfig


object TheMealDbEndpoint {


    const val FIND_MEAL = BuildConfig.BASE_URL_API+"filter.php"
    const val LOOKUP_MEAL = BuildConfig.BASE_URL_API+"lookup.php"
}