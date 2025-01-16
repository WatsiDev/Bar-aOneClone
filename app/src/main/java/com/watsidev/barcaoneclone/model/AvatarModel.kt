package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class AvatarModel(
    override val imageRes: Int,
    override val imageText: Int?,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object AvatarData{
    val avatarMaleList= listOf(
        AvatarModel(
            R.drawable.profile_avatar_ter_stegen,
            R.string.TerStegen
        ),
        AvatarModel(
            R.drawable.profile_avatar_olmo,
            R.string.DaniOlmo
        ),
        AvatarModel(
            R.drawable.profile_avatar_cubarsi,
            R.string.PauCubarsi
        ),
        AvatarModel(
            R.drawable.profile_avatar_balde,
            R.string.AlejandroBalde
        ),
        AvatarModel(
            R.drawable.profile_avatar_raphinha,
            R.string.Raphinha
        ),
        AvatarModel(
            R.drawable.profile_avatar_lewandowski,
            R.string.Lewandowski
        ),
        AvatarModel(
            R.drawable.profile_avatar_yamal,
            R.string.LamineYamal
        ),
        AvatarModel(
            R.drawable.profile_avatar_kounde,
            R.string.JulesKounde
        ),
        AvatarModel(
            R.drawable.profile_avatar_pedri,
            R.string.Pedri
        ),
        AvatarModel(
            R.drawable.profile_avatar_ronald,
            R.string.RonaldAraujo
        )
    )

    val avatarFemaleList = listOf(
        AvatarModel(
            R.drawable.profile_avatar_alexia,
            R.string.AlexiaPutellas
        ),
        AvatarModel(
            R.drawable.profile_avatar_aitana,
            R.string.AitanaBonmati
        ),
        AvatarModel(
            R.drawable.profile_avatar_ewa,
            R.string.EwaPajor
        ),
        AvatarModel(
            R.drawable.profile_avatar_mapi,
            R.string.MapiLeon
        ),
        AvatarModel(
            R.drawable.profile_avatar_cata,
            R.string.CataColi
        ),
        AvatarModel(
            R.drawable.profile_avatar_salma,
            R.string.SalmaParaluello
        ),
        AvatarModel(
            R.drawable.profile_avatar_marta,
            R.string.MartaTorrejon
        ),
        AvatarModel(
            R.drawable.profile_avatar_engen,
            R.string.Engen
        ),
        AvatarModel(
            R.drawable.profile_avatar_graham,
            R.string.GrahamHansen
        ),
        AvatarModel(
            R.drawable.profile_avatar_fridolina,
            R.string.FridolinaRolfo
        )
    )
}
