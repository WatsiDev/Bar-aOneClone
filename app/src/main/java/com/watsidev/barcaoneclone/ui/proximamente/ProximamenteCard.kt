package com.watsidev.barcaoneclone.ui.proximamente

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
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
import com.watsidev.barcaoneclone.model.ProximamenteModel


@Composable
fun CardProximamente(proximamente: ProximamenteModel) {
    Column(
        modifier = Modifier
    ) {
        Image(
            painterResource(proximamente.imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .clip(shape = RoundedCornerShape(16.dp))
        )
        Text(
            stringResource(proximamente.labelRes),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(8.dp)
        )
    }
}