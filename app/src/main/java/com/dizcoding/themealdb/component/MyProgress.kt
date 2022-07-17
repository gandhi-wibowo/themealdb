package com.dizcoding.themealdb.component

import android.app.Activity
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


fun Activity.progress(): AlertDialog {
    val linearLayout = LinearLayout(this)
    linearLayout.orientation = LinearLayout.HORIZONTAL
    linearLayout.setPadding(30, 30, 30, 30)
    linearLayout.gravity = Gravity.CENTER

    val linearLayoutparam = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.WRAP_CONTENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
    linearLayoutparam.gravity = Gravity.CENTER

    linearLayout.layoutParams = linearLayoutparam

    val progressBar = ProgressBar(this)

    progressBar.isIndeterminate = true
    progressBar.setPadding(0, 0, 30, 0)
    progressBar.layoutParams = linearLayoutparam

    val tvText = TextView(this)
    tvText.text = "Loading ..."
    tvText.setTextColor(Color.parseColor("#000000"))
    tvText.textSize = 20f
    tvText.layoutParams = linearLayoutparam

    linearLayout.addView(progressBar)
    linearLayout.addView(tvText)

    val builder: AlertDialog.Builder = AlertDialog.Builder(this)
    builder.setCancelable(true)
    builder.setView(linearLayout)

    return builder.create()
}