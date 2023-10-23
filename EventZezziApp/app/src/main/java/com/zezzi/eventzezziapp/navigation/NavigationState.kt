package com.zezzi.eventzezziapp.navigation

sealed class NavigationState(val route: String) {
    object Meals: NavigationState("Meals")
    object Filter: NavigationState("Filter")
}