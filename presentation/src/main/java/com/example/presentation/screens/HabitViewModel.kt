package com.example.presentation.screens

import android.util.Log
import androidx.lifecycle.*
import com.example.data.repository.HabitsRepositoryImpl
import com.example.domain.GetHabitUseCase
import com.example.domain.domainmodel.HabitEntity
import com.example.domain.domainmodel.HabitResult
import kotlinx.coroutines.launch
import java.lang.Exception

class HabitViewModel(private val repositoryImpl: HabitsRepositoryImpl): ViewModel() {
    private val mutableHabit: MutableLiveData<HabitResult> = MutableLiveData()

    val habit: LiveData<HabitResult> = mutableHabit

    init {
        load()
    }

    fun load(){
        viewModelScope.launch {
            try {
//                val addHabit = habitUseCase.addHabit(habitBodyItem)
//                var usCase = habitUseCase.getHabit()
                var response = repositoryImpl.getHabits()
                mutableHabit.value = response
                Log.i("View",response.toString())
//                mutableHabit.value = usCase.body()
//                Log.i("ViewModel",usCase.body().toString())
            }catch (e: Exception){}
        }
    }
}