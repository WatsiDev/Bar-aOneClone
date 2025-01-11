package com.watsidev.barcaoneclone.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.ui.lazyRows.PlayerCards

@Composable
fun PlayersScreen(navigateBack: () -> Unit) {
    Scaffold(
        modifier = Modifier,
        topBar = { TopAppBarca(showBackIcon = true, onBackClick = {navigateBack()} ) },
        containerColor = MaterialTheme.colorScheme.primaryContainer,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            ListPlayers()
        }
    }
}

@Composable
fun ListPlayers(modifier: Modifier = Modifier){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(horizontal = 16.dp)
    ) {
        item {
            Text(
                "LOS JUGADORES",
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )
        }
        item { }
        items(PlayersData.playersList) { item ->
            PlayerCards(item)
        }
    }
}