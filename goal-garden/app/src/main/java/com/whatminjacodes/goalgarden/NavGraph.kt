package com.whatminjacodes.goalgarden

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.whatminjacodes.goalgarden.Destinations.INFO_SCREEN_ROUTE
import com.whatminjacodes.goalgarden.Destinations.MAIN_SCREEN_ROUTE
import com.whatminjacodes.goalgarden.info.InfoScreenRoute
import com.whatminjacodes.goalgarden.main.MainScreenRoute

object Destinations {
    const val INFO_SCREEN_ROUTE = "info"
    const val MAIN_SCREEN_ROUTE = "main"
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = INFO_SCREEN_ROUTE) {
        composable(INFO_SCREEN_ROUTE) {
            InfoScreenRoute(OnOpenAppClicked = {
                navController.navigate(MAIN_SCREEN_ROUTE)
            })
        }

        composable(MAIN_SCREEN_ROUTE){
            val message  = "message from start screen"
            MainScreenRoute(messageFromStart = message!!)
        }
    }
}