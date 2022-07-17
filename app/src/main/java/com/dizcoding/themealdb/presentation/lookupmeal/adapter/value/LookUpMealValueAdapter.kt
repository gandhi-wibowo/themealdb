package com.dizcoding.themealdb.presentation.lookupmeal.adapter.value

import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.databinding.ActivityLookUpMealValueBinding

fun lookUpMealValueAdapter() = itemDelegate<MealValueModel>(R.layout.activity_look_up_meal_value)
    .bind {
        val binding = ActivityLookUpMealValueBinding.bind(containerView)
        binding.root.text = it.value
    }