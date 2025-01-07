package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class BarcaOriginalsModel(
    override val imageRes: Int,
    override val imageText: Int?,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object BarcaOriginalsData{
    val OriginalsList = listOf(
        BarcaOriginalsModel(
            R.drawable.originalsmasculino,
            R.string.EquipoMasculino
        ),
        BarcaOriginalsModel(
            R.drawable.originalsfemenino,
            R.string.EquipoFemenino
        ),
        BarcaOriginalsModel(
            R.drawable.originalsleyendas,
            R.string.Leyendas
        ),
        BarcaOriginalsModel(
            R.drawable.originalssecciones,
            R.string.MasEquipos
        ),
        BarcaOriginalsModel(
            R.drawable.originalstodobarca,
            R.string.TodoElBarca
        ),
    )
}
