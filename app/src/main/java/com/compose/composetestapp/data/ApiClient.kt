package com.compose.composetestapp.data

import com.compose.composetestapp.domain.ApiButton
import com.compose.composetestapp.domain.MainScreenDataModel
import retrofit2.Response


class ApiClient(
    private val rstTurService: RstTurService
) {
    suspend fun getAllData(): Response<MainScreenDataModel> {
        return rstTurService.listRepos()
    }
}