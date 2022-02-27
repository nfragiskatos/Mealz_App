package com.nfragiskatos.mealzapp.ui.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nfragiskatos.mealzapp.model.response.MealsCategoryResponse
import com.nfragiskatos.mealzapp.ui.theme.MealzAppTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealzAppTheme {
                MealsCategoriesScreen()
            }
        }
    }
}

@Composable
fun MealsCategoriesScreen() {
    val viewModel: MealsCategoriesViewModel = viewModel()
    val rememberedCategories = remember { mutableStateOf(emptyList<MealsCategoryResponse>()) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(
        key1 = "GET_MEALS_CATEGORIES") {
        coroutineScope.launch(Dispatchers.IO) {
            val mealsCategories = viewModel.getMealsCategories()
            rememberedCategories.value = mealsCategories
        }
    }

    LazyColumn {
        items(rememberedCategories.value) { category ->
            Text(text = category.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MealzAppTheme {
        MealsCategoriesScreen()
    }
}