package com.example.data.network

import com.example.data.model.HabitData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.PUT

interface Api {

    @PUT("")
    @Headers("Authorization")
    suspend fun putHabit(auth: String, @Body habitData: HabitData): Response<HabitData>
}