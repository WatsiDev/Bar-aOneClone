package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.ProfileData
import com.watsidev.barcaoneclone.model.ProfilesModel
import com.watsidev.barcaoneclone.navigation.components.ButtonBarca

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SelectProfileScreen() {
    Scaffold(
        topBar = { TopAppBarca(titleImg = R.drawable.barcaonelogo) },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { innerPadding ->
        SelectProfile(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun SelectProfile(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            "¿Quién está viendo?",
            style = MaterialTheme.typography.labelSmall,
            color = Color.White,
            fontSize = 30.sp
        )
        ProfileLazyGrid()
        Spacer(Modifier.weight(1f))
        ButtonBarca("GESTIONAR PERFILES")
        Spacer(Modifier.height(25.dp))
    }
}

@Composable
fun ProfileLazyGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .padding(horizontal = 20.dp)
    ) {
        items(ProfileData.profileList) {
            ProfileItem(it)
        }
    }
}

@Composable
fun ProfileItem(profilesModel: ProfilesModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Image(
            painterResource(profilesModel.imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(percent = 100))
                .size(120.dp, 120.dp)
                .aspectRatio(1f)
        )
        profilesModel.imageText?.let {
            Text(
                stringResource(profilesModel.imageText),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.labelSmall,
                fontSize = 35.sp
            )
        }
    }
}