package com.dizcoding.themealdb.domain.remote.usecase

import com.dizcoding.themealdb.component.extensions.isRequiredField
import com.dizcoding.themealdb.component.rx.BaseSingleCase
import com.dizcoding.themealdb.domain.remote.TheMealDbRepository
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.thumbnail.MealThumbnailModel
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.title.MealTitleModel
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.value.MealValueModel
import io.reactivex.Single

class LookUpMealUseCase(private val repository: TheMealDbRepository) :
    BaseSingleCase<MutableList<Any>>() {
    override fun buildSingle(data: HashMap<String, String>): Single<MutableList<Any>> {
        return repository.lookUpMeal(data).map {
            val ret = mutableListOf<Any>()
            it.meals?.let {
                it.forEach {
                    ret.add(MealThumbnailModel(it.strMealThumb))
                    ret.add(MealTitleModel(it.strMeal))

                    it.strTags?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Tag"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }

                    it.strCategory?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Category"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }

                    it.strInstructions?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Instruction"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }

                    it.strIngredient1?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Ingredient"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient2?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient3?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient4?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient5?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient6?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient7?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient8?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient9?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient10?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient11?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient12?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient13?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient14?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient15?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient16?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient17?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient18?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient19?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strIngredient20?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }


                    it.strMeasure1?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Measure"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }


                    it.strMeasure2?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure3?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure4?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure5?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure6?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure7?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure8?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure9?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure10?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure11?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure12?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure13?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure14?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure15?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure16?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure17?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure18?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure19?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strMeasure20?.let {
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }

                    it.strSource?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Source"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                    it.strYoutube?.let {
                        if (it.isRequiredField()) ret.add(MealTitleModel("Youtube"))
                        if (it.isRequiredField()) ret.add(MealValueModel(it))
                    }
                }
            }
            ret
        }
    }
}