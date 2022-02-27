package com.nfragiskatos.mealzapp.model

import com.nfragiskatos.mealzapp.model.api.MealsWebService
import com.nfragiskatos.mealzapp.model.response.MealCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMealsCategories(): MealCategoriesResponse {
        return webService.getMealsCategories()
    }
}