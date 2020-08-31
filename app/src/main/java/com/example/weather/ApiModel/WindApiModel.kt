package com.example.weather.ApiModel

import com.google.gson.annotations.SerializedName

class WindApiModel(
    @SerializedName("speed") val speed: Float,
    @SerializedName("deg") val deg: Int
)
