package com.anshu.weathermvvm.repository

import com.anshu.weathermvvm.api.APIService
import javax.inject.Inject

class WeatherRepository
@Inject constructor (private val apiService: APIService) {

    suspend fun getWeather() = apiService.getWeather()
}