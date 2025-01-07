package com.watsidev.barcaoneclone.ui.lazyRows

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.watsidev.barcaoneclone.model.PrimaryCardInterface

@Composable
fun <T : PrimaryCardInterface> ColumnSection(
    itemsList: List<T>,
    title: String?,
    description: String?,
    onClick: () -> Unit,
    imageBackground: Int?,
) {
    Box(
        modifier = Modifier
            .padding(vertical = 20.dp)
            .fillMaxWidth()
            .height(520.dp)
            .background(Color(0xFF0212ac))
    ) {
        imageBackground?.let {
            Image(
                painterResource(imageBackground),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            title?.let {
                Text(
                    title,
                    style = MaterialTheme.typography.labelSmall,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 37.sp
                )
            }
            description?.let {
                Text(
                    description,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                )
            }
            LazyRowPlayers(
                items = itemsList
            )
            Button(
                onClick = { onClick() },
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
fun <T : PrimaryCardInterface> LazyRowPlayers(items: List<T>) {
    LazyRow(
        modifier = Modifier
            .height(300.dp)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(items) { item ->
            PlayerCards(item)
        }
    }
}

@Composable
fun <T : PrimaryCardInterface> PlayerCards(item: T, modifier: Modifier = Modifier) {
    Column {
        Image(
            painterResource(item.imageRes),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp))
        )
        item.imageText?.let {
            Text(
                stringResource(item.imageText!!),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}