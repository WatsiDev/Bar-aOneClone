package com.watsidev.barcaoneclone.navigation.start

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.TopAppBarca
import com.watsidev.barcaoneclone.navigation.components.ButtonBarca
import com.watsidev.barcaoneclone.navigation.components.TextFieldBarca

@Composable
fun AddNewProfileScreen(/*navigateBack: () -> Unit*/) {
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
                    titleText = "Editar perfil",
                    showBackIcon = true,
                    onBackClick = { /*navigateBack()*/ }
                )
            },
            containerColor = Color.Transparent
        ) { innerPadding ->
            AddNewProfile(
                modifier = Modifier
                    .padding(innerPadding),
                onDone = { /*NavigateToManageProfile()*/ },
                onEdit = { })
        }
    }
}

@Composable
fun AddNewProfile(
    modifier: Modifier = Modifier,
    onDone: () -> Unit,
    onEdit: () -> Unit
) {
    var value by remember { mutableStateOf("JAIR") }
    val focusManager = LocalFocusManager.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.spacedBy(60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileEdit(
                onEdit
            )
            TextFieldBarca(
                value = value,
                onValueChange = { value = it },
                onDone = { focusManager.clearFocus() }
            )
        }
        Spacer(Modifier.weight(1f))
        ButtonBarca(
            BtnText = "LISTO",
            onClick = onDone
        )
        Spacer(Modifier.height(20.dp))
    }
}

@Composable
fun ProfileEdit(
    onEdit: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(130.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painterResource(R.drawable.profile_avatar_yamal),
            contentDescription = null,
            modifier = Modifier
                .size(110.dp)
                .clip(RoundedCornerShape(percent = 100))
                .border(
                    width = 5.dp,
                    Brush.linearGradient(listOf(Color.Red, Color.Blue)),
                    RoundedCornerShape(percent = 100)
                )
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(percent = 100))
                .background(Color.Black.copy(alpha = 0.5f))
        )
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(RoundedCornerShape(percent = 100))
                    .background(Color.LightGray.copy(0.25f)),
                contentAlignment = Alignment.Center
            ) {
                IconButton(
                    onClick = { onEdit() }
                ) {
                    Icon(
                        Icons.Outlined.Edit,
                        null,
                        tint = Color.White,
                        modifier = Modifier.padding(5.dp)
                    )
                }
            }
        }
    }
}
