package com.plcoding.rabbitsapp.data

import retrofit2.http.GET

interface RabbitsApi {

    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {
        const val BASE_URL = "http://127.0.0.1:8100"
    }
}