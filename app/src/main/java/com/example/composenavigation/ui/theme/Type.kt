package com.example.composenavigation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composenavigation.R

// Set of Material typography styles to start with
val irsans = FontFamily(Font(R.font.iranyekan))
val irsansbold = FontFamily(Font(R.font.iranyekanbold))
val irsansmedium = FontFamily(Font(R.font.iranyekanmedium))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 25.sp
    ),
    h1 = TextStyle(
        fontFamily = irsansmedium,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp,
        lineHeight = 25.sp

    ),
    h2 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 25.sp

    ),
    h3 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 25.sp

    ),
    h4 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 25.sp

    ),
    h5 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 25.sp

    ),
    h6 = TextStyle(
        fontFamily = irsans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 25.sp

    )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)