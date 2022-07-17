package com.dizcoding.themealdb.presentation.main.adapter.items.holder

import androidx.recyclerview.widget.GridLayoutManager
import com.dizcoding.adapterdelegate.DelegatesAdapter
import com.dizcoding.adapterdelegate.bind
import com.dizcoding.adapterdelegate.itemDelegate
import com.dizcoding.themealdb.R
import com.dizcoding.themealdb.databinding.ActivityMainResultHolderBinding
import com.dizcoding.themealdb.domain.remote.data.MealsData
import com.dizcoding.themealdb.presentation.main.adapter.items.mainSearchResultItemAdapter

fun mainSearchResultAdapter(itemClick: (MealsData) -> Unit) =
    itemDelegate<MainSearchResultData>(R.layout.activity_main_result_holder)
        .bind {
            val binding = ActivityMainResultHolderBinding.bind(containerView)

            val adapter = DelegatesAdapter(
                mainSearchResultItemAdapter { itemClick.invoke(it) }
            )

            binding.rvResult.layoutManager = GridLayoutManager(containerView.context, 3)
            binding.rvResult.adapter = adapter
            adapter.submitList(it.items)
            if (it.items.isNotEmpty()) {
                binding.tvTitle.text = "Meals found"
            } else {
                binding.tvTitle.text = "Meals not found"
            }
        }