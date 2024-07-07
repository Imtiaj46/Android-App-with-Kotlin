package com.example.recipeapp

import kotlinx.parcelize.Parcelize

sealed class Screen (val route:String){
    object RecipeScreen:Screen("recipeScreen")
    object DetailScreen:Screen("detailScreen")
}