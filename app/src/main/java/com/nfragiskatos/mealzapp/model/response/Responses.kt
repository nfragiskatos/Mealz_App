package com.nfragiskatos.mealzapp.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(
    @SerializedName("categories")
    val categories: List<MealsCategoryResponse>
)

data class MealsCategoryResponse(
    @SerializedName("idCategory")
    val id: String,

    @SerializedName("strCategory")
    val name: String,

    @SerializedName("strCategoryThumb")
    val imageUrl: String,

    @SerializedName("strCategoryDescription")
    val description: String
)