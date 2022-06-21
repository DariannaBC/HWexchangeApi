package com.itsecurity.hwexchangeapi.data.remote.dto

data class ExchangeDto(
    val name: String,
    val description: String ?,
    val active: Boolean = false,
    val last_updated: String
)
