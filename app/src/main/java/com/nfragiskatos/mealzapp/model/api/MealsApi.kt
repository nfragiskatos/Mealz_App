package com.nfragiskatos.mealzapp.model.api

import com.nfragiskatos.mealzapp.model.response.MealCategoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class MealsWebService {
    lateinit var api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    suspend fun getMealsCategories(): MealCategoriesResponse {
        return api.getMealsCategories()
    }

    interface MealsApi {
        @GET("categories.php")
        suspend fun getMealsCategories(): MealCategoriesResponse
    }
}