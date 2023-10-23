package com.zezzi.eventzezziapp.ui.filters.view

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.networking.response.FilterResponse
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch
import kotlin.math.log

class FiltersViewModel(private val repository: MealsRepository = MealsRepository()):ViewModel() {

    var filterUiState by mutableStateOf(FilterUiState(emptyList()))
        private set

    fun getFilter(category:String){
        filterUiState = FilterUiState(emptyList(), loading = true)

        viewModelScope.launch {
            filterUiState = FilterUiState(
                meals = repository.getFilter(category).meals
            )
        }
    }
}