package com.example.habit.di.module

import com.example.data.network.Api
import com.example.data.repository.HabitsRepositoryImpl
import com.example.domain.GetHabitUseCase
import com.example.domain.HabitsRepository
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers

@Module
class AppModule {
    @Provides
    fun provideAddHabitUseCase(repository: HabitsRepository): GetHabitUseCase{
        return GetHabitUseCase(repository, Dispatchers.IO)
    }

    @Provides
    fun provideHabitRepository(api: Api): HabitsRepository{
//        val remoteHabitsDataStore = RemoteHabitsDataStore(api)
        return HabitsRepositoryImpl(api)
    }
}