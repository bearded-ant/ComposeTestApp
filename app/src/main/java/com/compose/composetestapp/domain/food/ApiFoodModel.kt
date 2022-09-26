package com.compose.composetestapp.domain.food

data class ApiFoodModel(
    val `data`: List<Data>,
    val error: Any,
    val success: Boolean,
    val time: String
)