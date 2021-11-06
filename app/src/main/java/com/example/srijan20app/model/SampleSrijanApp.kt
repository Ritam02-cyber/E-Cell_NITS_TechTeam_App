package com.example.srijan20app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SampleSrijanApp(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId: Int) {
}