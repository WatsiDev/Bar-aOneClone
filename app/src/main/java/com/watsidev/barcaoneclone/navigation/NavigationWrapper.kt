package com.watsidev.barcaoneclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.watsidev.barcaoneclone.BarcaOneApp

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Inicio) {
        composable<Inicio> {
            BarcaOneApp { navController.navigate(Players) }
        }
        composable<Players> {
            PlayersScreen { navController.popBackStack() }
        }
    }
}