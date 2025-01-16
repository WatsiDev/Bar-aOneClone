package com.watsidev.barcaoneclone.ui.lazyGrids

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
import com.watsidev.barcaoneclone.model.PrimaryCardInterface

@Composable
fun <T: PrimaryCardInterface>GridCards(
    item: T,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        Image(
            painterResource(item.imageRes),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
        )
        item.imageText?.let {
            Text(
                stringResource(item.imageText!!),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            )
        }
    }
}