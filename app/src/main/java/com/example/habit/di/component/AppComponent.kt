package com.example.habit.di.component

import android.app.Application
import com.example.habit.di.module.AppModule
import com.example.data.di.module.NetworkModule
import com.example.data.di.scope.AppScope
import com.example.habit.HabitApp
import com.example.presentation.screens.HabitsFragment
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        AppModule::class,
        NetworkModule::class]
)

@AppScope
interface AppComponent : AndroidInjector<HabitApp> {
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: Application): Builder
//        fun build(): AppComponent
//    }
    fun inject(habitsFragment: HabitsFragment)
}