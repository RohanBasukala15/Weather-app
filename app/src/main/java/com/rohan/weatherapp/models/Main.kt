package com.rohan.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Int,
    val feels_like: Double,
    val temp_min: Int,
    val temp_max: Int,
    val pressure: Int,
    val humidity: Int,
): Serializable