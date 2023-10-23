package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.networking.response.MealResponse
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import com.zezzi.eventzezziapp.ui.filters.view.FilterUiState
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {

    var categoriesUiState by mutableStateOf(MealUiState(emptyList()))
        private set
    fun getMeals(){

        categoriesUiState = MealUiState(emptyList(), true)

        viewModelScope.launch {
            categoriesUiState = MealUiState(repository.getMeals().categories)
        }
    }
}

data class MealUiState(
    val categories: List<MealResponse>,
    val loading: Boolean = false)

