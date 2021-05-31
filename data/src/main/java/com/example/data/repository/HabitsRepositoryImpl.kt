package com.example.data.repository

import com.example.data.network.Api
import com.example.domain.HabitsRepository
import com.example.domain.domainmodel.HabitEntity
import com.example.domain.domainmodel.HabitIdEntity
import com.example.domain.domainmodel.HabitResult
import retrofit2.Response

class HabitsRepositoryImpl(private val api: Api): HabitsRepository{
    override suspend fun getHabits(): HabitResult? {
        return api.getHabits().body()
    }
//
//    override suspend fun addHabit(habitEntity: HabitEntity): HabitResult {
//        return api.addHabit(habitEntity)
//    }

}