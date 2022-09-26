package com.compose.composetestapp.data

import com.compose.composetestapp.domain.food.ApiFoodModel
import com.compose.composetestapp.domain.main.MainScreenDataModel
import retrofit2.Response
import retrofit2.http.GET


interface RstTurService {

    @GET("main?id=117")
    suspend fun listRepos(): Response<MainScreenDataModel>

    @GET("fun?id=117&type=food")
    suspend fun listFood(): Response<ApiFoodModel>
}