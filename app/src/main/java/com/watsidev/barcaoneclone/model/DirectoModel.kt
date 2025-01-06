package com.watsidev.barcaoneclone.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.watsidev.barcaoneclone.R

data class DirectoModel(
    @StringRes val labelRes: Int,
    @DrawableRes val imageRes: Int
)

val directoList = listOf(
    DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
    DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
    DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
    DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
    DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
)
