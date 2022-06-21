package com.itsecurity.hwexchangeapi.data

import com.itsecurity.hwexchangeapi.data.remote.dto.ExchangeDto

data class ExchangeListState(
    val isLoading: Boolean = false,
    val exchange: List<ExchangeDto> = emptyList(),
    val error: String = ""
)