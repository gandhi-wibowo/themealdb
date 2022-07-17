package com.dizcoding.themealdb.presentation.lookupmeal

import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.adapterdelegate.DelegatesAdapter
import com.dizcoding.themealdb.databinding.ActivityLookUpMealBinding
import com.dizcoding.themealdb.presentation.base.BaseActivity
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.thumbnail.lookUpMealThumbnailAdapter
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.title.lookUpMealTitleAdapter
import com.dizcoding.themealdb.presentation.lookupmeal.adapter.value.lookUpMealValueAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class LookUpMealActivity : BaseActivity<LookUpMealActivityViewModel, ActivityLookUpMealBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityLookUpMealBinding
        get() = ActivityLookUpMealBinding::inflate

    override fun buildViewModel(): LookUpMealActivityViewModel {
        val vm: LookUpMealActivityViewModel by viewModel()
        return vm
    }

    lateinit var adapter: DelegatesAdapter<Any>
    override fun setup() {
        intent.extras?.let {
            val mealId = it.get("mealId")
            viewModel.getMealDetails(mealId.toString())
        }
        adapter = DelegatesAdapter(
            lookUpMealThumbnailAdapter(),
            lookUpMealTitleAdapter(),
            lookUpMealValueAdapter()
        )

        binding.rvLookup.layoutManager = LinearLayoutManager(this)
        binding.rvLookup.adapter = adapter
    }

    override fun initLiveDataObservers() {
        super.initLiveDataObservers()
        viewModel.items().observe(this) {
            adapter.submitList(it)
        }
    }

}