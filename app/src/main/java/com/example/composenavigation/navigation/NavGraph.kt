package com.example.composenavigation.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenavigation.ui.Screens.HomeScreen
import com.example.composenavigation.ui.Screens.SplashScreen
import com.example.composenavigation.ui.screens.basketScreen
import com.example.composenavigation.ui.screens.categoryScreen
import com.example.composenavigation.ui.screens.profileScreen


@Composable
fun setUpNavgraph(navController:NavHostController){
    NavHost(navController = navController, startDestination =Screen.splash_screen.route ){
        composable(route = Screen.splash_screen.route ){
            SplashScreen(navController)
        }
        composable(route = Screen.home.route ){
            HomeScreen(navController)
        }

        composable(route = Screen.category.route ){
            categoryScreen(navController)
        }

        composable(route = Screen.basket.route ){
            basketScreen(navController)
        }

        composable(route = Screen.profile.route ){
            profileScreen(navController)
        }
    }

}