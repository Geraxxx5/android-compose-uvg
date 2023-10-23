package com.zezzi.eventzezziapp.data.networking.response

import com.google.gson.annotations.SerializedName

data class DetailMealResponse(val meals: List<DetailMeal>)

data class DetailMeal(
    @SerializedName("idMeal") val id:String,
    @SerializedName("strMeal") val name:String,
    @SerializedName("strCategory") val category:String,
    @SerializedName("strArea") val area:String,
    @SerializedName("strInstructions") val instructions:String,
    @SerializedName("strMealThumb") val imageUrl: String,
    @SerializedName("strIngredient1") val ingredient1:String?,
    @SerializedName("strIngredient2") val ingredient2:String?,
    @SerializedName("strIngredient3") val ingredient3:String?,
    @SerializedName("strIngredient4") val ingredient4:String?,
    @SerializedName("strIngredient5") val ingredient5:String?,
    @SerializedName("strIngredient6") val ingredient6:String?,
    @SerializedName("strIngredient7") val ingredient7:String?,
    @SerializedName("strIngredient8") val ingredient8:String?,
    @SerializedName("strIngredient9") val ingredient9:String?,
    @SerializedName("strIngredient10") val ingredient10:String?,
    @SerializedName("strIngredient11") val ingredient11:String?,
    @SerializedName("strIngredient12") val ingredient12:String?,
    @SerializedName("strIngredient13") val ingredient13:String?,
    @SerializedName("strIngredient14") val ingredient14:String?,
    @SerializedName("strIngredient15") val ingredient15:String?,
    @SerializedName("strIngredient16") val ingredient16:String?,
    @SerializedName("strIngredient17") val ingredient17:String?,
    @SerializedName("strIngredient18") val ingredient18:String?,
    @SerializedName("strIngredient19") val ingredient19:String?,
    @SerializedName("strIngredient20") val ingredient20:String?
){
    var ingredients: Map<String, String?>
    init {
        ingredients = mapOf(
            "strIngredient1" to ingredient1,
            "strIngredient2" to ingredient2,
            "strIngredient3" to ingredient3,
            "strIngredient4" to ingredient4,
            "strIngredient5" to ingredient5,
            "strIngredient6" to ingredient6,
            "strIngredient7" to ingredient7,
            "strIngredient8" to ingredient8,
            "strIngredient9" to ingredient9,
            "strIngredient10" to ingredient10,
            "strIngredient11" to ingredient11,
            "strIngredient12" to ingredient12,
            "strIngredient13" to ingredient13,
            "strIngredient14" to ingredient14,
            "strIngredient15" to ingredient15,
            "strIngredient16" to ingredient16,
            "strIngredient17" to ingredient17,
            "strIngredient18" to ingredient18,
            "strIngredient19" to ingredient19,
            "strIngredient20" to ingredient20,
        )
    }

}
