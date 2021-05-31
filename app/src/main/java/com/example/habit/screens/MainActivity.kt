package com.example.habit.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.habit.R
import com.example.presentation.screens.HabitsFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_main,HabitsFragment()).commit()
    }
}