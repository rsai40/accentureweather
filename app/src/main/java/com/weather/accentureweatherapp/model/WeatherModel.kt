package com.weather.accentureweatherapp.model

import com.google.gson.annotations.SerializedName

data class WeatherModel(
    @SerializedName("coord") var cord            : CoordModel? = null,
    @SerializedName("main") var temp            : WeatherTempModel? = null,
    @SerializedName("weather") var weatherInfo            : List<WeatherInModel>? = null,
) {
    override fun toString(): String {
        return "WeatherModel(cord=$cord)"
    }
}
