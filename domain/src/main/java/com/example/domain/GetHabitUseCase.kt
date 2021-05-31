package com.example.domain

import com.example.domain.domainmodel.HabitEntity
import com.example.domain.domainmodel.HabitResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class GetHabitUseCase @Inject constructor(private val habitsRepository: HabitsRepository,
                                          private val coroutineDispatcher: CoroutineDispatcher) {
    suspend fun getHabit(): HabitResult? {
        return withContext(coroutineDispatcher){
//            val habit = habitsRepository.addHabit(habitEntity)
            val habit = habitsRepository.getHabits()
            return@withContext habit
        }
    }
}