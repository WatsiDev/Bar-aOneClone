package com.watsidev.barcaoneclone.ui.lazyRows

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.model.PrimaryCardInterface

@Composable
fun <T: PrimaryCardInterface> CardItem(item: T, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .width(350.dp)
    ) {
        Image(
            painterResource(item.imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        item.imageText?.let {
            Text(
                stringResource(item.imageText!!),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(8.dp),
            )
        }
        item.descriptionRes?.let {
            Text(
                stringResource(item.descriptionRes!!),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
