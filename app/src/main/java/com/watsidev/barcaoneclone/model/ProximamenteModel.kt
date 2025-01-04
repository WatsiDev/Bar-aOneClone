package com.watsidev.barcaoneclone.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.watsidev.barcaoneclone.R

data class ProximamenteModel(
    @DrawableRes val imageRes: Int,
    @StringRes val labelRes: Int
)

val proxList = listOf(
    ProximamenteModel(R.drawable.barcaenvivo, R.string.BarcaEnVivo),
)

