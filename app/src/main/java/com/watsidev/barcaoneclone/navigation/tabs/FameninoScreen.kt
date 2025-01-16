package com.watsidev.barcaoneclone.navigation.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.NavBar
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.Buttons
import com.watsidev.barcaoneclone.model.CampNouEvloution
import com.watsidev.barcaoneclone.model.MasBarcaData
import com.watsidev.barcaoneclone.ui.lazyRows.SectionRow

@Composable
fun FemeninoScreen(
    navigateHome: () -> Unit,
    navigateTeam: () -> Unit,
    navigateStream: () -> Unit
){
    Scaffold(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        topBar = {
            TopAppBarca(
                titleImg = R.drawable.barcaonelogo,
                showSearchIcon = true,
                showProfileIcon = true
            )
        },
        bottomBar = {
            NavBar(
                navigationHome = { navigateHome() },
                navigationTeam = { navigateTeam() },
                navigationStream = { navigateStream() },
                navigationFemenino = {  }
            )
        },
    ) { paddingValues ->
        Femenino(modifier = Modifier.padding(bottom = 80.dp))
    }
}

@Composable
fun Femenino(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ){
        HeadSection(
            title = "Femenino y Más Barça",
            description = "Porque somos el club polideportivo más grande del mundo...",
            imageBackground = R.drawable.femenino_top
        )
        ButtonsBarca(items = MasBarcaData.masBarcaList)
        SectionRow(
            title = "Evolución del Spotify Camp Nou",
            items = CampNouEvloution.CampNouList,
        )
    }
}

@Composable
fun <T: Buttons>ButtonsBarca(items: List<T>) {
    LazyRow {
        items(items){item ->
            ButtonBarcaSections(item)
        }
    }
}

@Composable
fun HeadSection(
    title: String?,
    description : String?,
    imageBackground: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.BottomCenter,
    ) {
        Image(
            painterResource(imageBackground),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            title?.let {
                Text(
                    it,
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                )
            }
            description?.let {
                Text(
                    it,
                    style = MaterialTheme.typography.displayMedium,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(Modifier.height(20.dp))
        }
    }
}


@Composable
fun <T: Buttons>ButtonBarcaSections(
    item: T
){
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 10.dp),
        onClick = {}
    ) {
        Text(item.title)
    }
}