package com.itsecurity.hwexchangeapi.data.remote

import com.itsecurity.hwexchangeapi.data.remote.dto.ExchangeDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ExchangeApi {
    @GET("/v1/exchanges")
    suspend fun getExchange(): List<ExchangeDto>

    @GET("/v1/exchanges/{exchangeId}")
    suspend fun getExchange(@Path("coinId") coinId: String): ExchangeDto
}