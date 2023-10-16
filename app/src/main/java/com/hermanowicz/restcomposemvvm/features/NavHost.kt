package com.hermanowicz.restcomposemvvm.features

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hermanowicz.restcomposemvvm.features.list.ListRoute

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.List.route
    ) {
        composable(route = AppScreens.List.route) {
            ListRoute()
        }
    }
}