package com.example.composenavigation.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composenavigation.R
import com.example.composenavigation.navigation.Screen
import com.example.composenavigation.ui.Components.Loading3dots
import com.example.composenavigation.ui.theme.splashColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController:NavController){
    splash()
    LaunchedEffect(key1 =true){
        delay(2000)
        navController.navigate(Screen.home.route){
            popUpTo(Screen.splash_screen.route){
                inclusive=true
            }
        }
    }
}

@Composable
fun splash(){

    Box(modifier = Modifier
        .background(splashColor)
        .fillMaxSize(), contentAlignment = Alignment.Center) {

        Image(modifier = Modifier.size(250.dp),painter = painterResource(id = R.drawable.digi_logo), contentDescription ="" )

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(100.dp), contentAlignment = Alignment.BottomCenter){
            Image(modifier = Modifier.height(30.dp),painter = painterResource(id = R.drawable.digi_txt_white), contentDescription ="" )


        }
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp), contentAlignment = Alignment.BottomCenter){
            Loading3dots()


        }

    }

}