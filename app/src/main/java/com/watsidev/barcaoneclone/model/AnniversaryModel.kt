package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class AnniversaryModel(
    override val imageRes: Int,
    override val imageText: Int? = null,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object Anniversary125{
    val anniversaryList = listOf(
        AnniversaryModel(
            R.drawable.aniversariobarca
        )
    )
}
