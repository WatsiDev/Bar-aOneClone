package com.watsidev.barcaoneclone.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.ui.lazyRows.PlayerCards

@Composable
fun PlayersScreen(navigateBack: () -> Unit) {
    Scaffold(
        modifier = Modifier,
        topBar = { TopAppBarca2(navigateLambda = { navigateBack() }) },
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarca2(navigateLambda: () -> Unit) {
    val listColors = listOf(
        MaterialTheme.colorScheme.primaryContainer,
        MaterialTheme.colorScheme.primaryContainer,
        Color.Transparent
    )
    Box(
        modifier = Modifier
            .background(Brush.verticalGradient(listColors))
    ) {
        CenterAlignedTopAppBar(
            title = {
                Image(
                    painterResource(R.drawable.barcaonelogo),
                    contentDescription = "Logo Barça One",
                    modifier = Modifier
                        .height(35.dp)
                )
            },
            navigationIcon = {
                IconButton(
                    onClick = { navigateLambda() }
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, null, tint = Color.White)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            ),
            modifier = Modifier
        )
    }
}
