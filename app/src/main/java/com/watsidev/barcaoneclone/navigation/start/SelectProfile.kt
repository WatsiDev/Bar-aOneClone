package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.model.ProfileData
import com.watsidev.barcaoneclone.model.ProfilesModel
import com.watsidev.barcaoneclone.navigation.components.ButtonBarca

@Composable
fun SelectProfileScreen(navigateInicio: () -> Unit, navigateManageProfiles: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painterResource(R.drawable.profile_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Scaffold(
            topBar = {
                TopAppBarca(
                    titleImg = R.drawable.barcaonelogo
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            SelectProfile(
                modifier = Modifier
                    .padding(innerPadding),
                navigateInicio,
                navigateManageProfiles
            )
        }
    }
}

@Composable
fun SelectProfile(
    modifier: Modifier = Modifier,
    navigateInicio: () -> Unit,
    navigateManageProfiles: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            "¿QUIÉN ESTÁ VIENDO?",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
        )
        ProfileLazyGrid(onClick = navigateInicio)
        Spacer(Modifier.weight(1f))
        ButtonBarca(
            "GESTIONAR PERFILES",
            onClick = { navigateManageProfiles() }
        )
        Spacer(Modifier.height(25.dp))
    }
}

@Composable
fun ProfileLazyGrid(modifier: Modifier = Modifier, onClick: () -> Unit) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .padding(horizontal = 60   .dp)
    ) {
        items(ProfileData.profileList) {
            ProfileItem(it, navigateInicio = { onClick() })
        }
    }
}

@Composable
fun ProfileItem(profilesModel: ProfilesModel, navigateInicio: () -> Unit) {
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
                .border(
                    BorderStroke(
                        5.dp,
                        Brush.linearGradient(listOf(Color.Red, Color.Blue)),
                    ),
                    RoundedCornerShape(percent = 100)
                )
                .size(100.dp)
                .clickable { navigateInicio() }
        )
        profilesModel.imageText?.let {
            Text(
                stringResource(profilesModel.imageText),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
    }
}