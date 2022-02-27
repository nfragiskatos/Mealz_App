package com.nfragiskatos.mealzapp.model.response

import com.google.gson.annotations.SerializedName

data class MealCategoriesResponse(
    @SerializedName("categories")
    val categories: List<MealCategoryResponse>
)

data class MealCategoryResponse(
    @SerializedName("idCategory")
    val id: String,

    @SerializedName("strCategory")
    val name: String,

    @SerializedName("strCategoryThumb")
    val imageUrl: String,

    @SerializedName("strCategoryDescription")
    val description: String
)