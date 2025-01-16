package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.navigation.components.ButtonBarca
import com.watsidev.barcaoneclone.navigation.components.TextFieldBarca

@Composable
fun EditProfileScreen(
    navigateBack: () -> Unit
) {
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
                    titleText = "Editar Perfil",
                    showBackIcon = true,
                    onBackClick = { navigateBack() }
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            EditProfile(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun EditProfile(
    modifier: Modifier = Modifier
) {
    val focusManager = LocalFocusManager.current
    var value by remember { mutableStateOf("Jair") }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ) {
        Image(
            painterResource(R.drawable.profile_avatar_yamal),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(100))
                .border(
                    BorderStroke(
                        5.dp,
                        Brush.linearGradient(listOf(Color.Red, Color.Blue))
                    ),
                    RoundedCornerShape(100)
                )
        )
        TextFieldBarca(value = value, onValueChange = { value = it }, onDone = {})
        Spacer(Modifier.weight(1f))
        ButtonBarca("LISTO", onClick = { focusManager.clearFocus() })
        Spacer(Modifier.height(25.dp))
    }
}

