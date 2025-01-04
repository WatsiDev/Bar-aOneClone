package com.watsidev.barcaoneclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.watsidev.barcaoneclone.ui.Carrousel
import com.watsidev.barcaoneclone.ui.proximamente.Proximamente
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
    ) { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Carrousel(modifier = Modifier.padding(top = 45.dp))
            InicioScreen(modifier = Modifier.padding(top = 25.dp))
        }
    }
}

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Proximamente()
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
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Inicio",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                )
            }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painterResource(R.drawable.run),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            selected = false,
            label = { Text("Primer equipo", style = MaterialTheme.typography.labelSmall) }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painterResource(R.drawable.originals),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            selected = false,
            label = { Text("Originals", style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .padding(bottom = 16.dp)) }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painterResource(R.drawable.video),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            selected = false,
            label = { Text("Directo", style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .padding(bottom = 16.dp)) }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painterResource(R.drawable.femenino),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            selected = false,
            label = { Text("Femenino y más Barça", style = MaterialTheme.typography.labelSmall) }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painterResource(R.drawable.history),
                    contentDescription = null,
                    tint = Color.White
                )
            },
            selected = false,
            label = {
                Text(
                    "Historia",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
            }
        )
    }
}

@Composable
fun TabExample() {
    //Creamos una data class para el texto y el titulo del Tab
    data class TabData(val title: String, val icon: ImageVector)

    val tabs = listOf(
        TabData("Inicio", Icons.Filled.Home),
        TabData("Barça One", Icons.Filled.Home),
        TabData("Origins", Icons.Filled.Home),
        TabData("Directo", Icons.Filled.Home),
        TabData("Mas barca", Icons.Filled.Home),
        TabData("Historia", Icons.Filled.Home),
    )
    val selectedTab = remember { mutableStateOf(0) }

    Column {
        TabRow(
            selectedTabIndex = selectedTab.value,
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            modifier = Modifier
                .height(80.dp)
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selectedTab.value == index,
                    onClick = { selectedTab.value = index },
                    text = { Text(text = tab.title, style = MaterialTheme.typography.labelSmall) },
                    icon = {
                        Icon(
                            imageVector = tab.icon,
                            contentDescription = null // Provide a content description if needed
                        )
                    }
                )
            }
        }

        // Contenido para cada tab
        when (selectedTab.value) {

        }
    }

}