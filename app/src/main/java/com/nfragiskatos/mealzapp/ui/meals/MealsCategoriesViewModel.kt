package com.nfragiskatos.mealzapp.ui.meals

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nfragiskatos.mealzapp.model.MealsRepository
import com.nfragiskatos.mealzapp.model.response.MealsCategoryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            categoriesState.value = getMealsCategories()
        }
    }

    val categoriesState = mutableStateOf(emptyList<MealsCategoryResponse>())

    private suspend fun getMealsCategories(): List<MealsCategoryResponse> {
        return repository.getMealsCategories().categories
    }
}