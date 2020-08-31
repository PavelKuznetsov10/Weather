package com.example.weather.ApiModel

import com.google.gson.annotations.SerializedName

data class WeatherApiModel(
    @SerializedName("coord") val coord: CoordApiModel,
    @SerializedName("weather") val weather: List<WeatherApiModel> = listOf(),
    @SerializedName("base") val base: String,
    @SerializedName("main") val main: MainApiModel,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("wind") val wind: WindApiModel,
    @SerializedName("clouds") val clouds: CloudsApiModel,
    @SerializedName("dt") val dt: Long,
    @SerializedName("sys") val sys: SysApiModel,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("cod") val cod: Short
)