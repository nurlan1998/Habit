package com.example.data.repository

//import com.example.data.mappers.HabitDataEntityMapper
//import com.example.data.network.Api
//import com.example.domain.HabitsDataStore
//import com.example.domain.domainmodel.HabitEntity
//import retrofit2.Response
//
//class RemoteHabitsDataStore(private val api: Api): HabitsDataStore {
//
//    private val habitDataMapper = HabitDataEntityMapper()
//
//    override suspend fun getHabits(): List<HabitEntity> {
//        return api.getHabits().body()!!.map { it.toHabit() }
//    }
//}