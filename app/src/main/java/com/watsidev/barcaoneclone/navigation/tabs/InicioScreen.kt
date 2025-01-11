package com.watsidev.barcaoneclone.navigation.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.model.BarcaOriginalsData
import com.watsidev.barcaoneclone.model.CampNouEvloution
import com.watsidev.barcaoneclone.model.NextGenerationData
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.model.proxList
import com.watsidev.barcaoneclone.ui.Carrousel
import com.watsidev.barcaoneclone.ui.banner.SectionBanner
import com.watsidev.barcaoneclone.ui.lazyRows.ColumnSection
import com.watsidev.barcaoneclone.ui.lazyRows.SectionRow

@Composable
fun InicioScreen(modifier: Modifier = Modifier, navigateLambda:() -> Unit ) {
    Column(
        modifier = modifier
            .fillMaxSize()
//            .padding(horizontal = 16.dp)
    ) {
        Carrousel(modifier = Modifier.padding(top = 45.dp))
        SectionRow(
            title = "Próximamente en One",
            items = proxList
        )
        SectionBanner(
            image = R.drawable.elnouclambanner,
            label = R.string.ElNouClam
        )
        SectionRow(
            title = "La evolución del nuevo Spotify Camp nou",
            items = CampNouEvloution.CampNouList
        )
        SectionBanner(
            image = R.drawable.aniversariobarca,
            label = null
        )
        SectionRow(
            title = "The Next Generation",
            items = NextGenerationData.nextGenerationList
        )
        SectionRow(
            title = "Lo último en Can Barça",
            items = NextGenerationData.nextGenerationList
        )
        SectionBanner(
            image = R.drawable.cracksdelfuturo,
            label = null
        )
        ColumnSection(
            itemsList = BarcaOriginalsData.OriginalsList,
            title = "BARÇA ORIGINALS",
            description = "Tus ídolos, como nunca antes los habías visto.",
            onClick = { /*TODO*/ },
            imageBackground = null
        )
        ColumnSection(
            itemsList = PlayersData.playersList,
            title = "LOS JUGADORES",
            description = "Todo el contenido que no sabías que necesitabas sobre tus jugadores favoritos.",
            onClick = navigateLambda,
            imageBackground = R.drawable.playersbackground
        )
    }
}