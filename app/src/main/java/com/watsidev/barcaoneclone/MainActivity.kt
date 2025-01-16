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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.watsidev.barcaoneclone.model.itemsNavBar
import com.watsidev.barcaoneclone.navigation.core.NavigationWrapper
import com.watsidev.barcaoneclone.navigation.start.AddNewProfileScreen
import com.watsidev.barcaoneclone.navigation.start.ManageProfile
import com.watsidev.barcaoneclone.navigation.start.SelectAvatarScreen
import com.watsidev.barcaoneclone.navigation.start.SelectProfileScreen
import com.watsidev.barcaoneclone.navigation.tabs.DirectoScreen
import com.watsidev.barcaoneclone.navigation.tabs.FemeninoScreen
import com.watsidev.barcaoneclone.navigation.tabs.InicioScreen
import com.watsidev.barcaoneclone.navigation.tabs.PrimerEquipoScreen
import com.watsidev.barcaoneclone.ui.theme.BarcaOneCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BarcaOneCloneTheme {
                NavigationWrapper()
//                FemeninoScreen({}, {}) { }
            }
        }
    }
}

@Composable
fun BarcaOneApp(
    navigataToPlayers: () -> Unit,
    navigationTeam: () -> Unit,
    navigationStream: () -> Unit,
    navigationFemenino: () -> Unit
) {
    Scaffold(
        topBar = { TopAppBarca(showProfileIcon = true, showSearchIcon = true, titleImg = R.drawable.barcaonelogo) },
        bottomBar = { NavBar(
            {},
            navigationTeam,
            navigationStream,
            navigationFemenino
        ) },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            InicioScreen(
                modifier = Modifier.padding(bottom = 85.dp),
                navigateLambda = navigataToPlayers
            )
        }
        paddingValues
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarca(
    showBackIcon: Boolean = false,
    onBackClick: (() -> Unit)? = null,
    showSearchIcon: Boolean = false,
    onSearchClick: (() -> Unit)? = null,
    showProfileIcon: Boolean = false,
    onProfileClick: (() -> Unit)? = null,
    titleImg: Int? = null,
    titleText: String? = null
) {
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
                if (titleImg != null) {
                    Image(
                        painterResource(titleImg),
                        contentDescription = "Logo Barça One",
                        modifier = Modifier
                            .height(35.dp)
                    )
                } else if (titleText != null) {
                    Text(
                        titleText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Light
                    )
                }
            },
            navigationIcon = {
                if (showBackIcon) {
                    IconButton(
                        onClick = { onBackClick?.invoke() }
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack,
                            null,
                            tint = Color.White
                        )
                    }

                }
            },
            actions = {
                if (showSearchIcon && showProfileIcon) {
                    IconButton(
                        onClick = { onSearchClick?.invoke()}
                    ) {
                        Icon(
                            painterResource(R.drawable.search),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(
                        onClick = { onProfileClick?.invoke() }
                    ) {
                        Icon(
                            painterResource(R.drawable.user),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
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
fun NavBar(
    navigationHome: () -> Unit,
    navigationTeam: () -> Unit,
    navigationStream: () -> Unit,
    navigationFemenino: () -> Unit
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        modifier = Modifier
            .height(80.dp)
    ) {
//        itemsNavBar.forEachIndexed { index, item ->
//            NavigationBarItem(
//                onClick = {  },
//                icon = {
//                    Icon(
//                        painter = painterResource(item.icon),
//                        contentDescription = null,
//                        tint = Color.White,
//                    )
//                },
//                selected = false,
//                label = {
//                    Text(
//                        item.label,
//                        style = MaterialTheme.typography.labelSmall,
//                        modifier = Modifier
//                    )
//                }
//            )
//        }
        NavigationBarItem(
            onClick = { navigationHome() },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Inicio",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            onClick = { navigationTeam() },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.run),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Primer equipo",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.originals),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Originals",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            onClick = { navigationStream()},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.video),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Directo",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            onClick = { navigationFemenino() },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.femenino),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Femenino y mas barca",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
        NavigationBarItem(
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.history),
                    contentDescription = null,
                    tint = Color.White,
                )
            },
            selected = false,
            label = {
                Text(
                    "Historia",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        )
    }
}