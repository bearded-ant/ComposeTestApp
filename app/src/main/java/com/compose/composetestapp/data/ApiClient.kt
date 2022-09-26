package com.compose.composetestapp.data

import com.compose.composetestapp.domain.food.ApiFoodModel
import com.compose.composetestapp.domain.main.MainScreenDataModel
import retrofit2.Response


class ApiClient(
    private val rstTurService: RstTurService
) {
    suspend fun mainScreenData(): Response<MainScreenDataModel> {
        return rstTurService.listRepos()
    }

    suspend fun getFoodData(): Response<ApiFoodModel> {
        return rstTurService.listFood()
    }
}