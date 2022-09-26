package com.compose.composetestapp.domain.main

data class ApiError(
    val code: String,
    val message: String,
    val name: String,
    val status: String
)