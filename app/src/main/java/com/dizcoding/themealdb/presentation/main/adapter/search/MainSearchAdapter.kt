package com.dizcoding.themealdb.presentation.main.adapter.search

import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.component.extensions.avoidDoubleClicks
import com.dizcoding.themealdb.databinding.ActivityMainItemSearchBinding

fun mainSearchAdapter(keyword: (String) -> Unit) =
    itemDelegate<String>(R.layout.activity_main_item_search)
        .bind {
            val binding = ActivityMainItemSearchBinding.bind(containerView)
            binding.etSearch.hint = it
            binding.ivButtonSearch.setOnClickListener {
                it.avoidDoubleClicks()
                keyword.invoke(binding.etSearch.text.toString())
            }
        }