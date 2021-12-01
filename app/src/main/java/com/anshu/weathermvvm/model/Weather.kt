package com.anshu.weathermvvm.model

import com.google.android.gms.awareness.state.Weather

data class Weather(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<WeatherX>,
    val wind: Wind
) : Weather {
    override fun getTemperature(p0: Int): Float {
        TODO("Not yet implemented")
    }

    override fun getFeelsLikeTemperature(p0: Int): Float {
        TODO("Not yet implemented")
    }

    override fun getDewPoint(p0: Int): Float {
        TODO("Not yet implemented")
    }

    override fun getHumidity(): Int {
        TODO("Not yet implemented")
    }

    override fun getConditions(): IntArray {
        TODO("Not yet implemented")
    }

}