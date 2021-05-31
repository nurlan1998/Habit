package com.example.domain

import com.example.domain.domainmodel.HabitEntity
import com.example.domain.domainmodel.HabitIdEntity
import com.example.domain.domainmodel.HabitResult
import retrofit2.Response

interface HabitsRepository {
    suspend fun getHabits(): HabitResult?
//    suspend fun addHabit(habitEntity: HabitEntity): ArrayList<HabitEntity>
}