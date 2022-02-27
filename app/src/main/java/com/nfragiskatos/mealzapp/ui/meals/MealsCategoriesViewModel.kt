package com.nfragiskatos.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.nfragiskatos.mealzapp.model.MealsRepository
import com.nfragiskatos.mealzapp.model.response.MealsCategoryResponse

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) : ViewModel() {

    suspend fun getMealsCategories(): List<MealsCategoryResponse> {
        return repository.getMealsCategories().categories
    }
}