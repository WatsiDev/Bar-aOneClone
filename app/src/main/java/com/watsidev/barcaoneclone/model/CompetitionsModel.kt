package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class CompetitionsModel(
    override val imageRes: Int,
    override val imageText: Int? = null,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object CompetitionData{
    val competitionList= listOf(
        CompetitionsModel(
            R.drawable.laliga
        ),
        CompetitionsModel(
            R.drawable.championsleague
        ),
        CompetitionsModel(
            R.drawable.europaleague
        ),
        CompetitionsModel(
            R.drawable.copadelrey
        ),
        CompetitionsModel(
            R.drawable.supercopaespa_a
        )
    )
}