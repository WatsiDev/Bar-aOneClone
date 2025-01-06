package com.watsidev.barcaoneclone.ui.lazyRows

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.model.PlayersData
import com.watsidev.barcaoneclone.model.PlayersModel

@Composable
fun ColumnSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(520.dp)
    ){
        Image(
            painterResource(R.drawable.playersbackground),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(
            "LOS JUGADORES",
            style = MaterialTheme.typography.labelSmall,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 37.sp
        )
        Text(
            "Todo el contenido que no sabias que necesitabas sobre tus jugadores favoritos.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        LazyRowPlayers()
        Button(
            onClick = { },
            modifier = Modifier
                .height(55.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White.copy(alpha = 0.45f)
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                "DESCUBRIR MÁS",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
    }
}

@Composable
fun LazyRowPlayers(){
    LazyRow(
        modifier = Modifier
            .height(300.dp)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(PlayersData.playersList) {item ->
            PlayerCards(item)
        }
    }
}

@Composable
fun PlayerCards(playersModel: PlayersModel){
    Column {
        Image(
            painterResource(playersModel.imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        playersModel.imageText?.let {
            Text(
                stringResource(playersModel.imageText),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}