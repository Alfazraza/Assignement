package com.alfaz.assignement.util

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import de.hdodenhof.circleimageview.CircleImageView

@BindingAdapter("url")
fun loadImage(view: ImageView, url: String?) {
    if (!url.isNullOrBlank()) {
        Glide.with(view)
            .asBitmap()
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .into(view)
    }
}