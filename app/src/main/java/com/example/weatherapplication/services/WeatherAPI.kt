package com.example.weatherapplication.services

import com.example.weatherapplication.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

   //https://api.openweathermap.org/data/2.5/weather?q=Nairobi&appid=25ba9f1929850e3fb9987fd5fce5c1d4

    @GET("data/2.5/weather?&units=metric&APPID=04a42b96398abc8e4183798ed22f9485")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}