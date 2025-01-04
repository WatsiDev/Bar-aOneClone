package com.watsidev.barcaoneclone.ui.proximamente

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.model.proxList

@Composable
fun Proximamente(modifier: Modifier = Modifier) {
    Text("Próximamente en One", style = MaterialTheme.typography.titleMedium)
    Spacer(Modifier.height(8.dp))
    LazyRow(
        modifier = modifier
            .height(300.dp)
    ) {
        items(proxList) { proximamente ->
            CardProximamente(proximamente = proximamente)
        }
    }
}
