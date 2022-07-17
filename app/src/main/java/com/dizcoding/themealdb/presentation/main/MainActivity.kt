package com.dizcoding.themealdb.presentation.main

import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.adapterdelegate.DelegatesAdapter
import com.dizcoding.themealdb.databinding.ActivityMainBinding
import com.dizcoding.themealdb.presentation.base.BaseActivity
import com.dizcoding.themealdb.presentation.lookupmeal.LookUpMealActivity
import com.dizcoding.themealdb.presentation.main.adapter.items.holder.mainSearchResultAdapter
import com.dizcoding.themealdb.presentation.main.adapter.search.mainSearchAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun buildViewModel(): MainActivityViewModel {
        val vm: MainActivityViewModel by viewModel()
        return vm
    }

    private lateinit var adapter: DelegatesAdapter<Any>
    override fun setup() {
        adapter = DelegatesAdapter(
            mainSearchAdapter {
                viewModel.findMeal(it)
            },
            mainSearchResultAdapter {
                val intent = Intent(this, LookUpMealActivity::class.java)
                intent.putExtra("mealId", it.idMeal)
                startActivity(intent)
            }
        )
        binding.mainRv.layoutManager = LinearLayoutManager(this)
        binding.mainRv.adapter = adapter
    }

    override fun initLiveDataObservers() {
        super.initLiveDataObservers()
        viewModel.items().observe(this) {
            adapter.submitList(it)
        }

    }
}