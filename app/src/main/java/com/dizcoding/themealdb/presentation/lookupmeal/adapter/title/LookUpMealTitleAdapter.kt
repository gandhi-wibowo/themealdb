package com.dizcoding.themealdb.presentation.lookupmeal.adapter.title

import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.databinding.ActivityLookUpMealTitleBinding

fun lookUpMealTitleAdapter() = itemDelegate<MealTitleModel>(R.layout.activity_look_up_meal_title)
    .bind {
        val binding = ActivityLookUpMealTitleBinding.bind(containerView)
        binding.root.text = it.title
    }