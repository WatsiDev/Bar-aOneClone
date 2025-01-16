package com.watsidev.barcaoneclone.navigation.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.watsidev.barcaoneclone.BarcaOneApp
import com.watsidev.barcaoneclone.navigation.PlayersScreen
import com.watsidev.barcaoneclone.navigation.start.EditProfileScreen
import com.watsidev.barcaoneclone.navigation.start.ManageProfile
import com.watsidev.barcaoneclone.navigation.start.SelectProfileScreen
import com.watsidev.barcaoneclone.navigation.tabs.DirectoScreen
import com.watsidev.barcaoneclone.navigation.tabs.FemeninoScreen
import com.watsidev.barcaoneclone.navigation.tabs.PrimerEquipoScreen

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            SelectProfileScreen(navigateInicio = {
                navController.navigate(Inicio){
                    popUpTo<Inicio> {inclusive = true}
                }
            }) { navController.navigate(ManageProfile) }
        }
        composable<ManageProfile> {
            ManageProfile(navigateInicio = {
                navController.popBackStack()
            }) { navController.navigate(EditProfile) }
        }
        composable<EditProfile> {
            EditProfileScreen {
                navController.popBackStack()
            }
        }
        /*TABS*/
        composable<Inicio> {
            BarcaOneApp(
                navigationTeam = {navController.navigate(FirstTeam){
                    popUpTo<FirstTeam> {inclusive = true}
                } } ,
                navigataToPlayers = {navController.navigate(Players)},
                navigationStream = {navController.navigate(Stream){
                    popUpTo<Stream> {inclusive = true}
                } },
                navigationFemenino = {navController.navigate(Femenino){
                    popUpTo<Femenino> {inclusive = true}
                } }
            )
        }
        composable<Stream> {
            DirectoScreen(
                navigateHome = {navController.navigate(Inicio){
                    popUpTo<Inicio>{inclusive = true}
                } },
                navigateTeam = {navController.navigate(FirstTeam){
                    popUpTo<FirstTeam> { inclusive = true }
                } },
                navigateFemenino = {navController.navigate(Femenino){
                    popUpTo<Femenino> {inclusive = true}
                } }
            )
        }
        composable<Femenino> {
            FemeninoScreen(
                navigateTeam = {navController.navigate(FirstTeam){
                    popUpTo<FirstTeam>{inclusive = true}
                } },
                navigateHome = { navController.navigate(Inicio){
                    popUpTo<Inicio> {inclusive = true}
                } },
                navigateStream = {navController.navigate(Stream){
                    popUpTo<Stream> {inclusive = true}
                } }
            )
        }
        composable<FirstTeam> {
            PrimerEquipoScreen(
                navigateHome = {navController.navigate(Inicio){
                    popUpTo<Inicio>{inclusive = true}
                } },
                navigateStream = {navController.navigate(Stream){
                    popUpTo<Stream> {inclusive = true}
                } },
                navigateFemenino = {navController.navigate(Femenino){
                    popUpTo<Femenino> {inclusive = true}
                } }
            )
        }
        /*Section Inicio*/
        composable<Players> {
            PlayersScreen { navController.popBackStack() }
        }
    }
}