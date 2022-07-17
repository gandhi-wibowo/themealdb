package com.dizcoding.themealdb.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.dizcoding.themealdb.component.progress

abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : AppCompatActivity() {

    private var _binding: ViewBinding? = null
    abstract val bindingInflater: (LayoutInflater) -> VB

    protected val viewModel by lazy {
        buildViewModel()
    }

    @Suppress("UNCHECKED_CAST")
    protected val binding: VB
        get() = _binding as VB

    lateinit var progressDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        progressDialog = progress()
        setup()
        initLiveDataObservers()
    }


    abstract fun setup()

    protected abstract fun buildViewModel(): VM

    protected open fun initLiveDataObservers() {
        viewModel.loadingState().observe(this) {
            if (it) progressDialog.show()
            else progressDialog.hide()
        }
    }

}
