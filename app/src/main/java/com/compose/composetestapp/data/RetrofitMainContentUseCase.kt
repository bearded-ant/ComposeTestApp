package com.compose.composetestapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://rsttur.ru/api/base-app/"

class RetrofitMainContentUseCase {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val rstTourService: RstTurService by lazy { retrofit.create(RstTurService::class.java) }
    val apiClient = ApiClient(rstTourService)
}