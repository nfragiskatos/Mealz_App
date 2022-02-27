package com.nfragiskatos.mealzapp.ui.meals

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nfragiskatos.mealzapp.model.response.MealCategoryResponse
import com.nfragiskatos.mealzapp.ui.theme.MealzAppTheme

@Composable
fun MealsCategoriesScreen() {
    val viewModel: MealCategoriesViewModel = viewModel()
    val categories = viewModel.categoriesState.value

    LazyColumn {
        items(categories) { category ->
            Text(text = category.name)
        }
    }
}

@Composable
fun MealCategory(category: MealCategoryResponse) {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MealzAppTheme {
        MealsCategoriesScreen()
    }
}