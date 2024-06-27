package com.techmania.weatherapp.service;

import com.techmania.weatherapp.model.WeatherModel;
import com.techmania.weatherapp.util.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET(Constants.SUB_URL)
    Call<WeatherModel> getWeatherByLocation(@Query("lat") double userLatitude, @Query("lon") double userLongitude);

    @GET(Constants.SUB_URL)
    Call<WeatherModel> getWeatherByCityName(@Query("q") String cityName);

}
