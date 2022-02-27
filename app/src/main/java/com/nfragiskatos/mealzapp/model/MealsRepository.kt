package com.nfragiskatos.mealzapp.model

import com.nfragiskatos.mealzapp.model.api.MealsWebService
import com.nfragiskatos.mealzapp.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMealsCategories(): MealsCategoriesResponse {
        return webService.getMealsCategories()
    }
}