package com.example.domain

import com.example.domain.domainmodel.HabitEntity
import retrofit2.Response

interface HabitsDataStore {
    suspend fun getHabits(): List<HabitEntity>
}