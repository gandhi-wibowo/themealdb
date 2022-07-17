package com.dizcoding.themealdb.component.rx

import io.reactivex.Single

abstract class BaseSingleCase<T> {
    abstract fun buildSingle(data: HashMap<String, String> = hashMapOf()): Single<T>
    fun execute(data: HashMap<String, String> = hashMapOf()): Single<T> {
        return buildSingle(data).compose(SinggleTransformer())
    }
}