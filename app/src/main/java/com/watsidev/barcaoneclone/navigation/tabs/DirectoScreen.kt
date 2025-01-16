package com.watsidev.barcaoneclone.navigation.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.NavBar
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.DirectoData
import com.watsidev.barcaoneclone.ui.lazyGrids.SectionGrid

@Composable
fun DirectoScreen(
    navigateHome: () -> Unit,
    navigateTeam: () -> Unit,
    navigateFemenino: () -> Unit
){
    Scaffold(
        topBar = { TopAppBarca(
            showSearchIcon = true,
            showProfileIcon = true,
            titleImg = R.drawable.barcaonelogo
            )
        },
        bottomBar = {
            NavBar(
                navigationHome = { navigateHome() },
                navigationStream = { },
                navigationTeam = { navigateTeam() },
                navigationFemenino = { navigateFemenino() }
                )
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { padding ->
        Directo(modifier = Modifier.padding(padding))
    }
}

@Composable
fun Directo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        SectionGrid(
            items = DirectoData.directoList
        )
    }
}
