package com.zezzi.eventzezziapp.ui.detailmeal.view

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.zezzi.eventzezziapp.data.networking.response.DetailMeal
import com.zezzi.eventzezziapp.navigation.AppBar
import com.zezzi.eventzezziapp.ui.filters.view.CardItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailMealScreen(
    navController: NavController,
    viewModel: DetailMealViewModel = viewModel(),
    idMeal: String?
){
    if(viewModel.detailMealUiState.details.isEmpty()){
        viewModel.getDetailMeal(idMeal!!)
    }

    if(viewModel.detailMealUiState.loading){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                modifier = Modifier.width(64.dp),
                color = Color.LightGray
            )
        }
    }else{
        Scaffold(
            topBar = {
                AppBar(title = "Categories", navController = navController)
            }
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                contentPadding = it
            ) {
                items(viewModel.detailMealUiState.details) { details ->
                    BodyDetailMeal(details = details)
                }
            }
        }
    }
}

@Composable
fun BodyDetailMeal(details: DetailMeal){
    var cont = 1
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(model = details.imageUrl, contentDescription = "", Modifier.size(100.dp))
        Text(text = "Nombre: ${details.name}")
        Text(text = "Categoria: ${details.category}, Area: ${details.area}")
        Text(text = "Ingredientes: ")
        if(!details.ingredient1.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient1}")
            cont++
        }
        if(!details.ingredient2.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient2}")
            cont++
        }
        if(!details.ingredient3.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient3}")
            cont++
        }
        if(!details.ingredient4.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient4}")
            cont++
        }
        if(!details.ingredient5.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient5}")
            cont++
        }
        if(!details.ingredient6.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient6}")
            cont++
        }
        if(!details.ingredient7.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient7}")
            cont++
        }
        if(!details.ingredient8.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient8}")
            cont++
        }
        if(!details.ingredient9.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient9}")
            cont++
        }
        if(!details.ingredient10.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient10}")
            cont++
        }
        if(!details.ingredient11.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient11}")
            cont++
        }
        if(!details.ingredient12.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient12}")
            cont++
        }
        if(!details.ingredient13.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient13}")
            cont++
        }
        if(!details.ingredient14.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient14}")
            cont++
        }
        if(!details.ingredient15.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient15}")
            cont++
        }
        if(!details.ingredient16.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient16}")
            cont++
        }
        if(!details.ingredient17.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient17}")
            cont++
        }
        if(!details.ingredient18.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient18}")
            cont++
        }
        if(!details.ingredient20.isNullOrBlank()){
            Text(text = "$cont) ${details.ingredient20}")
            cont++
        }
        Text(text = "Intrucciones: \n ${details.instructions}")
    }
}