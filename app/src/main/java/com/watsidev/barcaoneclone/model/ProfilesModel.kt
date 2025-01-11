package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class ProfilesModel(
    override val imageRes: Int,
    override val imageText: Int?,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object ProfileData{
    val profileList = listOf(
        ProfilesModel(
            R.drawable.gavi,
            R.string.Jair
        ),
        ProfilesModel(
            R.drawable.lamineyamal,
            R.string.Lamine
        )
    )
}
