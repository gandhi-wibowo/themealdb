package com.dizcoding.themealdb.presentation.lookupmeal.adapter.thumbnail

import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.component.extensions.showRoundedImageWithGlide
import com.dizcoding.themealdb.databinding.ActivityLookUpMealThumbnailBinding

fun lookUpMealThumbnailAdapter() =
    itemDelegate<MealThumbnailModel>(R.layout.activity_look_up_meal_thumbnail)
        .bind {
            val binding = ActivityLookUpMealThumbnailBinding.bind(containerView)
            binding.root.showRoundedImageWithGlide(it.imageUrl.toString(), R.dimen.rad_10) {}
        }