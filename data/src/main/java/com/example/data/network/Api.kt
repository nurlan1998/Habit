package com.example.data.network

import com.example.domain.domainmodel.HabitEntity
import com.example.domain.domainmodel.HabitResult
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.PUT

interface Api {

    @PUT("/api/habit")
    @Headers("Authorization e189ec10-5cfb-4120-ae86-5e91d9c3016d")
    suspend fun addHabit(@Body habitEntity: HabitEntity): HabitResult

    @GET("/api/habit")
    @Headers("Authorization: e189ec10-5cfb-4120-ae86-5e91d9c3016d")
    suspend fun getHabits(): Response<HabitResult>
}