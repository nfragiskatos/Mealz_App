package com.nfragiskatos.mealzapp.model

import com.nfragiskatos.mealzapp.model.response.MealsCategoriesResponse

class MealsRepository {

    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())
}