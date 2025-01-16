package com.watsidev.barcaoneclone.navigation.tabs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.NavBar
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.CompetitionData
import com.watsidev.barcaoneclone.model.CompetitionsModel
import com.watsidev.barcaoneclone.model.MatchData
import com.watsidev.barcaoneclone.model.NextGenerationData
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.ui.lazyRows.ColumnSection
import com.watsidev.barcaoneclone.ui.lazyRows.LazyRowPlayers
import com.watsidev.barcaoneclone.ui.lazyRows.SectionRow

@Composable
fun PrimerEquipoScreen(
    navigateHome: () -> Unit,
    navigateStream: () -> Unit,
    navigateFemenino: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBarca(
                titleImg = R.drawable.barcaonelogo,
                showSearchIcon = true, showProfileIcon = true
            )
        },
        bottomBar = {
            NavBar(
                navigationTeam = {  },
                navigationHome = { navigateHome() },
                navigationStream = { navigateStream() },
                navigationFemenino = { navigateFemenino() }
            )
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { innerPadding ->
        innerPadding
        PrimerEquipo(modifier = Modifier)
    }
}

@Composable
fun PrimerEquipo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier,
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painterResource(R.drawable.barca_team),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    "PRIMER EQUIPO",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
                Row(
                    modifier = Modifier
                        .height(70.dp)
                ) {
                    ButtonIconBarca(Icons.Default.Add)
                    ButtonIconBarca(Icons.Default.Share)
                    ButtonIconBarca(Icons.Default.FavoriteBorder)
                }
                Text(
                    "1080p",
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(8.dp))
                        .padding(vertical = 4.dp, horizontal = 8.dp)
                )
            }
        }
        Spacer(Modifier.height(30.dp))
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .fillMaxWidth()
                .background(Color(0xFF1e224f))
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Todo lo que quieres y necesitas saber acerca del primer equipo del fútbol... ¡lo tienes aquí!",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(20.dp)
            )
            SectionRow(
                title = "Actualidad",
                items = NextGenerationData.nextGenerationList
            )
            ColumnSection(
                itemsList = PlayersData.playersList,
                title = "JUGADORES",
                description = "Nuestro mayor patrimonio.",
                onClick = {},
                imageBackground = R.drawable.players_background
            )
            SectionRow(
                title = "Actualidad",
                items = NextGenerationData.nextGenerationList
            )
            ColumnSection(
                itemsList = MatchData.matchList,
                title = "PARTIDOS 2024/25",
                description = "A comprehensive coverage of the games from the current season",
                onClick = {},
                imageBackground = R.drawable.partidos_background
            )
            Column {
                Text(
                    "Partidos",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding( horizontal = 20.dp)
                )
                LazyRowPlayers(
                    items = CompetitionData.competitionList
                )
            }
        }
    }
}

@Composable
fun ButtonIconBarca(icon: ImageVector) {
    IconButton(
        onClick = { },
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = Color.Gray,
            contentColor = Color.White
        )
    ) {
        Icon(
            icon,
            contentDescription = null
        )
    }
}
