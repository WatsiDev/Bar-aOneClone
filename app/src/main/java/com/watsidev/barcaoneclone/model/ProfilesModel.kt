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
            R.drawable.profile_avatar_lewandowski,
            R.string.Jair
        ),
        ProfilesModel(
            R.drawable.profile_avatar_yamal,
            R.string.Naty
        )
    )
}
