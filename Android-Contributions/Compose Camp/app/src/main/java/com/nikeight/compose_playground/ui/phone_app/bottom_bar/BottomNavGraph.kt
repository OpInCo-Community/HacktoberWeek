package com.nikeight.compose_playground.ui.phone_app.bottom_bar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nikeight.compose_playground.ui.phone_app.data.BottomBarScreen
import com.nikeight.compose_playground.ui.phone_app.screens.ContactScreen
import com.nikeight.compose_playground.ui.phone_app.screens.FavoriteScreen
import com.nikeight.compose_playground.ui.phone_app.screens.RecentLogScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Recent.route
    ) {
        composable(route = BottomBarScreen.Favorite.route) {
            FavoriteScreen(modifier = Modifier)
        }
        composable(route = BottomBarScreen.Recent.route) {
            RecentLogScreen()

        }
        composable(route = BottomBarScreen.Contacts.route) {
            ContactScreen()
        }
    }
}