package com.watsidev.barcaoneclone.ui.banner

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun SectionBanner(image: Int, label: Int?, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 16.dp)
    ) {
        Image(
            painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
        )
        label?.let {
            Text(
                stringResource(label),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }
}