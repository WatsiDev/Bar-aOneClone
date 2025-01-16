package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.AvatarData
import com.watsidev.barcaoneclone.model.AvatarModel
import com.watsidev.barcaoneclone.model.PrimaryCardInterface

@Composable
fun SelectAvatarScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painterResource(R.drawable.profile_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Scaffold(
            topBar = { TopAppBarca(
                titleText = "Seleccionar Avatar",
                showBackIcon = true)
                     },
            containerColor = Color.Transparent
        ) { innerPadding ->
            SelectAvatar(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun SelectAvatar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 30.dp),
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ) {
        AvatarRow(
            title = "Primer equipo masculino",
            items = AvatarData.avatarMaleList
        )
        AvatarRow(
            title = "Primer equipo femenino",
            items = AvatarData.avatarFemaleList
        )
    }
}

@Composable
fun <T: PrimaryCardInterface> AvatarRow(
    items: List<T>,
    title: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            title,
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(items) { item ->
                AvatarItem(item)
            }
        }
    }
}

@Composable
fun <T: PrimaryCardInterface>AvatarItem(item: T) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painterResource(item.imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(percent = 100))
        )
        item.imageText?.let{
            Text(
                stringResource(item.imageText!!),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
