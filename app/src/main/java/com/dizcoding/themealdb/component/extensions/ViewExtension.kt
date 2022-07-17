package com.dizcoding.themealdb.component.extensions

import android.view.View

fun View?.avoidDoubleClicks() {
    this ?: return
    if (!this.isClickable) {
        return
    }
    this.isClickable = false
    this.postDelayed({ this.isClickable = true }, 1000L)
}