package com.zezzi.eventzezziapp.ui.filters.view

import com.zezzi.eventzezziapp.data.networking.response.Meal

data class FilterUiState(
    val meals: List<Meal>,
    val loading: Boolean = false
)
