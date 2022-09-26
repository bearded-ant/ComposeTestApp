package com.compose.composetestapp.data

import com.compose.composetestapp.domain.ApiButton
import com.compose.composetestapp.domain.MainScreenDataModel
import retrofit2.Response
import retrofit2.http.GET


interface RstTurService {

    @GET("main?id=117")
    suspend fun listRepos(): Response<MainScreenDataModel>
}