package com.example.composenavigation.navigation

import androidx.compose.ui.graphics.painter.Painter

data class BottomNaviItem (
    val name:String,
    val route:String,
    val selectedIcon:Painter,
    val deSelectedIcon:Painter,

    )