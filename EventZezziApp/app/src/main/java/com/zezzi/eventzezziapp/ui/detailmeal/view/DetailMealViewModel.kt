package com.zezzi.eventzezziapp.ui.detailmeal.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import com.zezzi.eventzezziapp.ui.filters.view.FilterUiState
import kotlinx.coroutines.launch

class DetailMealViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel()  {

    var detailMealUiState by mutableStateOf(DetailMealUiState(emptyList()))
        private set

    fun getDetailMeal(idMeal:String){
        detailMealUiState = DetailMealUiState(emptyList(), loading = true)

        viewModelScope.launch {
            detailMealUiState = DetailMealUiState(details = repository.getDetailMeal(idMeal).meals)
        }
    }
}