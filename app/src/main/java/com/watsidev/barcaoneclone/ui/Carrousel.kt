package com.watsidev.barcaoneclone.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.R
import com.watsidev.barcaoneclone.data.images

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Carrousel(modifier: Modifier = Modifier) {
    val pageState = rememberPagerState(
        initialPage = 0,
        pageCount = { 10 },
        initialPageOffsetFraction = 0f
    )
    HorizontalPager(
        state = pageState,
        modifier = modifier
            .height(250.dp)
            .background(Color.Blue)
    ) { page ->
        val imagePage = images[page]
        Image(
            painterResource(imagePage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

