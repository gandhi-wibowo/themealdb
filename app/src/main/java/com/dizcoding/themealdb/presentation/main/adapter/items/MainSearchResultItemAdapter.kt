package com.dizcoding.themealdb.presentation.main.adapter.items

import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.click
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.component.extensions.showRoundedImageWithGlide
import com.dizcoding.themealdb.databinding.ActivityMainResultItemBinding
import com.dizcoding.themealdb.domain.remote.data.MealsData

fun mainSearchResultItemAdapter(itemClick : (MealsData) -> Unit) = itemDelegate<MealsData>(R.layout.activity_main_result_item)
    .click(itemClick)
    .bind {
        val binding = ActivityMainResultItemBinding.bind(containerView)
        binding.tvMealName.text = it.strMeal
        binding.ivMealImage.showRoundedImageWithGlide(it.strMealThumb.toString(), R.dimen.rad_10) {

        }
    }