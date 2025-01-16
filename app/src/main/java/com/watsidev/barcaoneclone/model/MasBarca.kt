package com.watsidev.barcaoneclone.model

interface Buttons {
    val title: String
}

data class MasBarcaModel(
    override val title: String
) : Buttons

object MasBarcaData {
    val masBarcaList = listOf(
        MasBarcaModel("Femenino"),
        MasBarcaModel("Baloncesto"),
        MasBarcaModel("Balonmano"),
        MasBarcaModel("Fútbol Sala"),
        MasBarcaModel("Hoquei Patines"),
        MasBarcaModel("Barça atlétic"),
        MasBarcaModel("Barça Legends"),
        MasBarcaModel("Fútbol Formativo")
    )
}
