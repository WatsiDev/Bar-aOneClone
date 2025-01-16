package com.watsidev.barcaoneclone.navigation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TextFieldBarca(value: String, onValueChange: (String) -> Unit, onDone: () -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Gray.copy(alpha = 0.25f),
            unfocusedContainerColor = Color.Gray.copy(alpha = 0.25f),
            cursorColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            selectionColors = TextSelectionColors(Color.Transparent, Color.Transparent)
        ),
        keyboardActions = KeyboardActions(
            onDone = { onDone() }
        ),
        textStyle = MaterialTheme.typography.labelMedium,
        maxLines = 1,
        singleLine = true,
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}