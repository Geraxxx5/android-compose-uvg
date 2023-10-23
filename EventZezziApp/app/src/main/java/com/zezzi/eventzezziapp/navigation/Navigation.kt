package com.zezzi.eventzezziapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zezzi.eventzezziapp.ui.detailmeal.view.DetailMealScreen
import com.zezzi.eventzezziapp.ui.filters.view.FilterScreen
import com.zezzi.eventzezziapp.ui.meals.view.MealsCategoriesScreen

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationState.Meals.route,
        modifier = modifier
    ) {
        composable(route = NavigationState.Meals.route) {
            MealsCategoriesScreen(navController)
        }
        composable("filter/{category}"){
            backStackEntry -> FilterScreen(navController = navController, category = backStackEntry.arguments?.getString("category"))
        }
        composable("detailMeal/{idMeal}"){
                backStackEntry ->
            DetailMealScreen(navController = navController, idMeal = backStackEntry.arguments?.getString("idMeal"))
        }
    }
}