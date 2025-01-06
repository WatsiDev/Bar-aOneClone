package com.watsidev.barcaoneclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.model.itemsNavBar
import com.watsidev.barcaoneclone.navigation.InicioScreen
import com.watsidev.barcaoneclone.ui.Carrousel
import com.watsidev.barcaoneclone.ui.theme.BarcaOneCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BarcaOneCloneTheme {
                BarcaOneApp()
            }
        }
    }
}

@Composable
fun BarcaOneApp() {
    Scaffold(
        topBar = { TopAppBarca() },
        bottomBar = { NavBar() },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Carrousel(modifier = Modifier.padding(top = 45.dp))
            InicioScreen(modifier = Modifier.padding(top = 25.dp, bottom = 85.dp))
        }
        paddingValues
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarca() {
    val listColors = listOf(
        MaterialTheme.colorScheme.primaryContainer,
        MaterialTheme.colorScheme.primaryContainer,
        Color.Transparent
    )
    Box(
        modifier = Modifier
            .background(Brush.verticalGradient(listColors))
    ) {
        CenterAlignedTopAppBar(
            title = {
                Image(
                    painterResource(R.drawable.barcaonelogo),
                    contentDescription = "Logo Barça One",
                    modifier = Modifier
                        .height(35.dp)
                )
            },
            actions = {
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        painterResource(R.drawable.search),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        painterResource(R.drawable.user),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            ),
            modifier = Modifier
        )
    }
}

@Composable
fun NavBar() {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        modifier = Modifier
            .height(80.dp)
    ) {
        itemsNavBar.forEachIndexed{ index, item ->
            NavigationBarItem(
                onClick = { },
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = null,
                        tint = Color.White,
                    )
                },
                selected = false,
                label = {
                    Text(
                        item.label,
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier
                    )
                }
            )
        }
    }
}