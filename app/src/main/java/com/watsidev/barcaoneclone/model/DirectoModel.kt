package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class DirectoModel(
    override val imageText: Int?,
    override val imageRes: Int,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object DirectoData{
    val directoList = listOf(
        DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
        DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
        DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
        DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
        DirectoModel(R.string.BarcaEnVivo, R.drawable.campnouenvivo),
    )
}
