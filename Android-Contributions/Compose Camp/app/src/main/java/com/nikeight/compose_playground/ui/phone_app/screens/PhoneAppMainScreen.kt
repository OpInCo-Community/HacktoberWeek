package com.nikeight.compose_playground.ui.phone_app.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nikeight.compose_playground.ui.phone_app.bottom_bar.BottomNavGraph
import com.nikeight.compose_playground.ui.phone_app.components.PhoneAppBar
import com.nikeight.compose_playground.ui.phone_app.data.BottomBarScreen

@Composable
fun PhoneAppMainScreen() {

    // Control and remember the state of the Whole Navigation flow
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            PhoneAppBar()
        },
        bottomBar = {
            BottomBar(navController = navController)
        },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "floating_dialing_action_icon_desc"
                )
            }
        }
    ) {
        /**
         * Hosted at the Main Screen of the
         * App,
         * New composable(s) will re-compose upon the conditions
         */
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavHostController) {

    val screens = listOf(
        BottomBarScreen.Favorite,
        BottomBarScreen.Recent,
        BottomBarScreen.Contacts,
    )

    // Maintain the BackStack of the Application
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    // Shows the CurrentDestination (@nullable)
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    // Pre Defined Bottom Nav Items
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}