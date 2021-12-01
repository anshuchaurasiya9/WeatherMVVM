package com.anshu.weathermvvm.api

import com.anshu.weathermvvm.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface APIService {


    @GET("weather?q=Bengaluru&APPID=9b8cb8c7f11c077f8c4e217974d9ee40")
    suspend fun getWeather(): Response<Weather>
}