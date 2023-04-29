package com.example.composenavigation.ui.Components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.composenavigation.R

@Composable
fun Loading3dots(){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading3dots))
    LottieAnimation(composition)

}