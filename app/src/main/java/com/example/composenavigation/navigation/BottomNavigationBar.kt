package com.example.composenavigation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composenavigation.navigation.Screen
import com.example.dgkala.navigation.BottomNaviItem
import com.example.composenavigation.R
import com.example.composenavigation.ui.theme.deSelectedBottomBar
import com.example.composenavigation.ui.theme.irsans
import com.example.composenavigation.ui.theme.selectedBottomBar


@Composable
fun BottomNavigationBar(navController:NavController,modifier: Modifier,onItemClick:(BottomNaviItem)->Unit){

    val items= listOf(
        BottomNaviItem(stringResource(id = R.string.home), route = Screen.home.route, painterResource(id = R.drawable.home_fill),painterResource(id = R.drawable.home_outline)),
        BottomNaviItem(stringResource(id = R.string.category), route = Screen.category.route, painterResource(id = R.drawable.category_fill),painterResource(id = R.drawable.category_outline)),
        BottomNaviItem(stringResource(id = R.string.basket), route = Screen.basket.route, painterResource(id = R.drawable.cart_fill),painterResource(id = R.drawable.cart_outline)),
        BottomNaviItem(stringResource(id = R.string.profile), route = Screen.profile.route, painterResource(id = R.drawable.user_fill),painterResource(id = R.drawable.user_outline)),
    )

    val backStateEntry=navController.currentBackStackEntryAsState()
    val showBottomBar=backStateEntry.value?.destination?.route in items.map { it.route }
    if (showBottomBar){
        BottomNavigation(modifier = modifier, backgroundColor = Color.White, elevation = 5.dp) {
            items.forEachIndexed{index,item->val selected=item.route==backStateEntry.value?.destination?.route
                BottomNavigationItem(selected = selected, onClick = {onItemClick(item)},
                unselectedContentColor = deSelectedBottomBar, selectedContentColor = selectedBottomBar, icon = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        if (selected){
                            Icon(painter = item.selectedIcon, contentDescription = "", modifier = Modifier.height(24.dp))
                        }else{
                            Icon(painter = item.deSelectedIcon, contentDescription = "", modifier = Modifier.height(24.dp))
                        }
                        Text(text = item.name, textAlign = TextAlign.Center, fontFamily = irsans, style = MaterialTheme.typography.h6, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                        
                    }
                    
                    }) 
            
            }

        }
    }

}