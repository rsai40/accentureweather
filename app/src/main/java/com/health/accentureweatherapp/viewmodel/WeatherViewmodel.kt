package com.health.accentureweatherapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.accentureweatherapp.model.WeatherInModel

class WeatherViewmodel : ViewModel() {

    private var newList= MutableLiveData<WeatherInModel>()

    fun observeWeatherLiveData() : LiveData<WeatherInModel> {
        return newList
    }
}