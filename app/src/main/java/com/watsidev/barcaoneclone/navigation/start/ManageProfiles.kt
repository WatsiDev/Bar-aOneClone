package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.TopAppBarca

@Composable
fun ManageProfile(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopAppBarca(showBackIcon = true, titleText = "Gestionar Perfiles") },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            ProfileLazyGrid(modifier = Modifier.padding(top = 50.dp))
        }
    }
}