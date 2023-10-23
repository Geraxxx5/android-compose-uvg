package com.zezzi.eventzezziapp.ui.detailmeal.view

import com.zezzi.eventzezziapp.data.networking.response.DetailMeal

data class DetailMealUiState(
    val details: List<DetailMeal>,
    val loading: Boolean = false
)