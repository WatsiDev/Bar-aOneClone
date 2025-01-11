package com.watsidev.barcaoneclone.navigation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBarca(BtnText: String){
    Button(
        onClick = { },
        modifier = Modifier
            .height(55.dp)
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray.copy(alpha = 0.45f)
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            BtnText,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
    }
}