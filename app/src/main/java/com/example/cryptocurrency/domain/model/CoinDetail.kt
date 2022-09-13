package com.example.cryptocurrency.domain.model

import com.example.cryptocurrency.data.remote.dto.*

data class CoinDetail(
    val description: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val coinId: String,
    val symbol: String,
    val tags: List<String>,
    val team: List<Team>
)
