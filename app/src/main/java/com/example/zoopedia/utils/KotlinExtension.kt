package com.example.zoopedia.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadUrl(url :String){
    Glide.with(this).clear(this)
    Glide.with(this).load(url).into(this)
}