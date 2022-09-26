package com.compose.composetestapp.domain.main

import com.google.gson.annotations.SerializedName

data class MainScreenDataModel(
    val success: Boolean,
    val error: ApiError,
    val time: String,
    @SerializedName("data")
    val dataApi: ApiData,

    )