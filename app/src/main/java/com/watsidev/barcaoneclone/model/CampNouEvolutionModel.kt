package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class CampNouEvolutionModel(
    override val imageRes: Int,
    override val imageText: Int,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object CampNouEvloution{
    val CampNouList = listOf(
        CampNouEvolutionModel(
            R.drawable.campnouevolution_1,
            R.string.CampEvolution01
        ),
        CampNouEvolutionModel(
            R.drawable.campnouevolution_2,
            R.string.CampEvolution02
        ),
        CampNouEvolutionModel(
            R.drawable.campnouevolution_3,
            R.string.CampEvolution03
        ),
        CampNouEvolutionModel(
            R.drawable.campnouevolution_4,
            R.string.CampEvolution04
        ),
    )
}