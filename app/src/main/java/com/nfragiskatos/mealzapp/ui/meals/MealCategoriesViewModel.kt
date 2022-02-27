package com.nfragiskatos.mealzapp.ui.meals

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nfragiskatos.mealzapp.model.MealsRepository
import com.nfragiskatos.mealzapp.model.response.MealCategoryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MealCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            categoriesState.value = getMealsCategories()
        }
    }

    val categoriesState = mutableStateOf(emptyList<MealCategoryResponse>())

    private suspend fun getMealsCategories(): List<MealCategoryResponse> {
        return repository.getMealsCategories().categories
    }
}