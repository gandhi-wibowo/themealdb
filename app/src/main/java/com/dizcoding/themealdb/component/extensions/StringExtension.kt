package com.dizcoding.themealdb.component.extensions

fun String?.isRequiredField(): Boolean {
    return this != null && isNotEmpty() && isNotBlank()
}