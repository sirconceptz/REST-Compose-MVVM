package com.hermanowicz.restcomposemvvm.features

sealed class AppScreens(
    val route: String
) {
    object List : AppScreens("LIST_ROUTE")
}