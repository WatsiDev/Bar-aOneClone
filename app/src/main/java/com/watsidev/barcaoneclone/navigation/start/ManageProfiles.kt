package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca

@Composable
fun ManageProfile(
    modifier: Modifier = Modifier,
    navigateInicio: () -> Unit,
    navigateEditProfile: () -> Unit
) {
    Box(
        modifier = modifier
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
                    showBackIcon = true,
                    onBackClick = { navigateInicio() },
                    titleText = "Gestionar Perfiles"
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                ProfileLazyGrid(
                    modifier = Modifier
                        .padding(top = 50.dp),
                    navigateEditProfile
                )
            }
        }
    }
}