package com.example.cryptocurrency.data.repo

import com.example.cryptocurrency.data.remote.CoinPaprikaAPI
import com.example.cryptocurrency.data.remote.dto.CoinDetailDto
import com.example.cryptocurrency.data.remote.dto.CoinDto
import com.example.cryptocurrency.domain.repo.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinPaprikaAPI) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinsById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}