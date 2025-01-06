package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class ElNouClamModel(
    override val imageRes: Int,
    override val imageText: Int,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object ElNouClamBanner{
    val NouClamList = listOf(
        ElNouClamModel(
            R.drawable.elnouclambanner,
            R.string.ElNouClam
        )
    )
}