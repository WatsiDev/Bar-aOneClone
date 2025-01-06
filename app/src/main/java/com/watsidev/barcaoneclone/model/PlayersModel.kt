package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class PlayersModel(
    override val imageRes: Int,
    override val imageText: Int?,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object PlayersData{
    val playersList = listOf(
        PlayersModel(
            R.drawable.hansiflick,
            R.string.HansiFlick
        ),
        PlayersModel(
            R.drawable.lamineyamal,
            R.string.LamineYamal
        ),
        PlayersModel(
            R.drawable.lewandowski,
            R.string.Lewandowski
        ),
        PlayersModel(
            R.drawable.raphi_a,
            R.string.Raphinha
        ),
        PlayersModel(
            R.drawable.kounde,
            R.string.JulesKounde
        ),
        PlayersModel(
            R.drawable.pedri,
            R.string.Pedri
        ),
        PlayersModel(
            R.drawable.terstegen,
            R.string.TerStegen
        ),
        PlayersModel(
            R.drawable.ferminlopez,
            R.string.FerminLopez
        ),
        PlayersModel(
            R.drawable.paucubarsi,
            R.string.PauCubarsi
        ),
        PlayersModel(
            R.drawable.ronaldaraujo,
            R.string.RonaldAraujo
        ),
        PlayersModel(
            R.drawable.gavi,
            R.string.Gavi
        ),
        PlayersModel(
            R.drawable.frankiedejong,
            R.string.FrankieDeJong
        ),
        PlayersModel(
            R.drawable.ferrantorres,
            R.string.FerranTorres
        ),
        PlayersModel(
            R.drawable.christensen,
            R.string.AndreasChristensen
        ),
        PlayersModel(
            R.drawable.i_igomartinez,
            R.string.I_igoMartinez
        ),
        PlayersModel(
            R.drawable.alexbalde,
            R.string.AlejandroBalde
        ),
        PlayersModel(
            R.drawable.daniolmo,
            R.string.DaniOlmo
        ),
        PlayersModel(
            R.drawable.i_akipe_a,
            R.string.IñakiPeña
        ),
    )
}