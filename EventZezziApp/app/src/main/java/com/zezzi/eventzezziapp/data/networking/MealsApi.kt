package com.zezzi.eventzezziapp.data.networking

import com.zezzi.eventzezziapp.data.networking.response.DetailMealResponse
import com.zezzi.eventzezziapp.data.networking.response.FilterResponse
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {
    @GET("categories.php")
    suspend fun getMeals(): MealsCategoriesResponse

    @GET("filter.php")
    suspend fun getFilter(@Query("c") category: String): FilterResponse

    @GET("lookup.php")
    suspend fun getMealDetails(@Query("i") idMeal: String):DetailMealResponse
}