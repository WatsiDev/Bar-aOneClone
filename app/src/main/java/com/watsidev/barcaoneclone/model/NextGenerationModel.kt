package com.watsidev.barcaoneclone.model

import com.watsidev.barcaoneclone.R

data class NextGenerationModel(
    override val imageRes: Int,
    override val imageText: Int,
    override val descriptionRes: Int? = null
): PrimaryCardInterface

object NextGenerationData{
    val nextGenerationList = listOf(
        NextGenerationModel(
            R.drawable.nextgenerationep1,
            R.string.NexGenEp1
        ),
        NextGenerationModel(
            R.drawable.nextgenerationep2,
            R.string.NexGenEp2
        ),
        NextGenerationModel(
            R.drawable.nextgenerationep3,
            R.string.NexGenEp3
        ),
        NextGenerationModel(
            R.drawable.nextgenerationep4,
            R.string.NexGenEp4
        )
    )
}