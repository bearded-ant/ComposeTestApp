package com.compose.composetestapp.domain

data class ApiError(
    val code: String,
    val message: String,
    val name: String,
    val status: String
)