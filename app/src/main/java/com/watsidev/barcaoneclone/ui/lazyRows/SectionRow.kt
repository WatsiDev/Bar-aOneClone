package com.watsidev.barcaoneclone.ui.lazyRows

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.model.PrimaryCardInterface

@Composable
fun <T: PrimaryCardInterface> SectionRow(
    title: String?,
    items: List<T>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(vertical = 20.dp)
    ) {
        title?.let { Text(it, style = MaterialTheme.typography.titleMedium) }
        Spacer(Modifier.height(16.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(items) { item ->
                CardItem(item = item)
            }
        }
    }
}
