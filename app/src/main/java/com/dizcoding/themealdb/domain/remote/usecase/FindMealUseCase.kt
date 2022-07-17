package com.dizcoding.themealdb.domain.remote.usecase

import com.dizcoding.themealdb.component.rx.BaseSingleCase
import com.dizcoding.themealdb.domain.remote.TheMealDbRepository
import com.dizcoding.themealdb.domain.remote.data.MealsData
import io.reactivex.Single

class FindMealUseCase(private val repository: TheMealDbRepository) : BaseSingleCase<MutableList<MealsData>>() {
    override fun buildSingle(data: HashMap<String, String>): Single<MutableList<MealsData>> {
        return repository.findMeal(data).map {
            it.meals?.map { MealsData(it.strMeal,it.strMealThumb,it.idMeal) }?.toMutableList()
        }
    }
}