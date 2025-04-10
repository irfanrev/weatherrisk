package com.irfanrev.weatherrisk.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    private fun getInstance() : Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.weatherapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

    val apiClient : ApiClient = getInstance().create(ApiClient::class.java)

}