package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class ProximamenteModel(
    override val imageRes: Int,
    override val imageText: Int,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

val proxList = listOf(
    ProximamenteModel(
        R.drawable.barcaenvivo,
        R.string.BarcaEnVivo
    ),
)

