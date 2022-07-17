package com.dizcoding.themealdb.component.extensions

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DimenRes
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

fun ImageView.showCircleImageWithGlide(imageSource: Any, onLoadError: (Boolean) -> Unit) {
    Glide
        .with(this)
        .load(imageSource)
        .circleCrop()
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                onLoadError.invoke(true)
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                onLoadError.invoke(false)
                return false
            }

        })
        .into(this)
}

fun ImageView.showRoundedImageWithGlide(
    imageSource: Any,
    @DimenRes rad: Int,
    onLoadError: (Boolean) -> Unit
) {
    val radius = context.resources.getDimensionPixelSize(rad)
    Glide
        .with(this)
        .load(imageSource)
        .transform(RoundedCorners(radius))
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                onLoadError.invoke(true)
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                onLoadError.invoke(false)
                return false
            }

        })
        .into(this)
}
