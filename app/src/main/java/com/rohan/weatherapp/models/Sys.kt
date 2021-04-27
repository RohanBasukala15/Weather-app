package com.rohan.weatherapp.models

import java.io.Serializable

data class Sys(
    val type: Int,
    val id: Int,
    val message: Int,
    val country: String,
    val sunrise: Int,
    val sunset: Int,
) : Serializable