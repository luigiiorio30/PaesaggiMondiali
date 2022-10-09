package com.example.paesaggi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class About(
    @StringRes val Name: Int,
    @DrawableRes val Img: Int,
    val AboutText: String,
)
