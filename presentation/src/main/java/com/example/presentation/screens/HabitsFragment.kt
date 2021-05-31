package com.example.presentation.screens

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.domain.GetHabitUseCase
import com.example.habit.HabitApp
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class HabitsFragment : Fragment() {

    @Inject
    lateinit var addHabitUseCase: GetHabitUseCase
    @Inject
    lateinit var getHabitUseCase: GetHabitUseCase

    @Inject
    lateinit var habitViewModel: HabitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (requireActivity().application as HabitApp) 
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        habitViewModel.load()
        habitViewModel.habit.observe(viewLifecycleOwner, Observer {
           Log.i("Response",it.toString())
        })
    }
}