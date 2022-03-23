package com.example.weatherapplication.services

import com.example.weatherapplication.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIService {

    //https://api.openweathermap.org/data/2.5/weather?q=Nairobi&appid=25ba9f1929850e3fb9987fd5fce5c1d4

    private val BASE_URL = "https://api.openweathermap.org/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataService(cityName: String): Single<WeatherModel> {
        return api.getData(cityName)
    }

}