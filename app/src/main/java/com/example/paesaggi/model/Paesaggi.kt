package com.example.paesaggi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Paesaggi(
    @StringRes val Title: Int,
    @DrawableRes val Image: Int,
    val Description: String,
)