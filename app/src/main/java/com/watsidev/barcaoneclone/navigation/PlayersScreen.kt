package com.watsidev.barcaoneclone.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.ui.lazyRows.PlayerCards

@Composable
fun PlayersScreen() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("LOS JUGADORES", style = MaterialTheme.typography.bodyLarge, color = Color.White)
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .border(BorderStroke(2.dp, color = Color.Red)),
            columns = GridCells.Fixed(2),
            state = rememberLazyGridState(),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(PlayersData.playersList) { item ->
                PlayerCards(item, modifier = Modifier.border(BorderStroke(2.dp, Color.Blue)))
            }
        }
    }
}