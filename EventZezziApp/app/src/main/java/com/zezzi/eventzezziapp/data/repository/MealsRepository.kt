package com.zezzi.eventzezziapp.data.repository

import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.DetailMealResponse
import com.zezzi.eventzezziapp.data.networking.response.FilterResponse
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return withContext(Dispatchers.IO){
            webService.getMeals()
        }
    }
    suspend fun getFilter(category: String):FilterResponse{
        return withContext(Dispatchers.IO){
            webService.getFilter(category)
        }
    }

    suspend fun getDetailMeal(idMeal: String):DetailMealResponse{
        return withContext(Dispatchers.IO){
            webService.getDetailMeal(idMeal)
        }
    }
}