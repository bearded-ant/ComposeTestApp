package com.compose.composetestapp.data

import com.compose.composetestapp.domain.food.ApiFoodModel
import com.compose.composetestapp.domain.main.MainScreenDataModel

class SharedRepository {
    suspend fun getMainScreenData(): MainScreenDataModel? {
        val request = RetrofitMainContentUseCase().apiClient.mainScreenData()

        if (request.isSuccessful) return request.body()!!
        return null
    }

    suspend fun getFoodData(): ApiFoodModel? {
        val request = RetrofitMainContentUseCase().apiClient.getFoodData()

        if (request.isSuccessful) return request.body()!!
        return null
    }
}