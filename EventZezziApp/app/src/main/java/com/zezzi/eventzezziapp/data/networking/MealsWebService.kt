package com.zezzi.eventzezziapp.data.networking

import android.util.Log
import com.zezzi.eventzezziapp.data.networking.response.DetailMealResponse
import com.zezzi.eventzezziapp.data.networking.response.FilterResponse
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory

class MealsWebService {

    private val api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    suspend fun getMeals(): MealsCategoriesResponse {
        return api.getMeals()
    }

    suspend fun getFilter(category: String): FilterResponse{
        return api.getFilter(category)
    }

    suspend fun getDetailMeal(idMeal: String): DetailMealResponse{
        return api.getMealDetails(idMeal)
    }
}