package com.example.run.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.run.repositories.MainRepository
import javax.inject.Inject

//Collect the data from repository and provide to all the fragments that will need it

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository): ViewModel()
{
    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}