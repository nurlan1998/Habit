package com.example.domain

import com.example.domain.domainmodel.HabitEntity
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AddHabitUseCase @Inject constructor(private val habitsRepository: HabitsRepository,
                      private val coroutineDispatcher: CoroutineDispatcher) {
    suspend fun getHabit(habitEntity: HabitEntity): ArrayList<HabitEntity> {
        return withContext(coroutineDispatcher){
//            val habit = habitsRepository.addHabit(habitEntity)
            val habit = habitsRepository.getHabits()
            return@withContext habit
        }
    }
}