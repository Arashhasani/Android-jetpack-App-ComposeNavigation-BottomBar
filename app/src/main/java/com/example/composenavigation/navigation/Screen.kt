package com.example.composenavigation.navigation

sealed class Screen (val route:String){
    object splash_screen:Screen("splash_screen")
    object home:Screen("home_screen")
    object category:Screen("category_screen")
    object basket:Screen("basket_screen")
    object profile:Screen("profile_screen")
}