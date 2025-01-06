package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class BottomNavModel(
    val label: String,
    val icon: Int
)

val itemsNavBar = listOf(
    BottomNavModel("Inicio", R.drawable.home),
    BottomNavModel("Primer Equipo", R.drawable.run),
    BottomNavModel("Originals", R.drawable.originals),
    BottomNavModel("Directo", R.drawable.video),
    BottomNavModel("Femenino y\nmas Barça", R.drawable.femenino),
    BottomNavModel("Historia", R.drawable.history)
)