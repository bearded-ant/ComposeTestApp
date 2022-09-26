package com.compose.composetestapp.data

import com.compose.composetestapp.domain.ApiButton
import com.compose.composetestapp.domain.MainScreenDataModel

class SharedRepository {
    suspend fun getAllData(): MainScreenDataModel? {
        val request = RetrofitMainContentUseCase().apiClient.getAllData()

        if (request.isSuccessful) return request.body()!!
        return null
    }
}