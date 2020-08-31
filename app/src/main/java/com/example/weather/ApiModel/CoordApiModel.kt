package com.example.weather.ApiModel

import com.google.gson.annotations.SerializedName

class CoordApiModel(
    @SerializedName("lon") val lon: Float,
    @SerializedName("lat") val lat: Float
)
