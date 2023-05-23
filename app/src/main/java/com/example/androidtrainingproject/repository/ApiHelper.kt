package com.example.androidtrainingproject.repository

import com.example.androidtrainingproject.models.LoginRequestBody
import com.example.androidtrainingproject.models.LoginResponse
import com.example.androidtrainingproject.models.ProductResponse

interface ApiHelper {
    suspend fun login(body: LoginRequestBody): LoginResponse

    suspend fun getProductById(id: Number): ProductResponse
}