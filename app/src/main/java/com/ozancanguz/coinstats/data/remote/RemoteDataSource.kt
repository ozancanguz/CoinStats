package com.ozancanguz.coinstats.data.remote

import com.ozancanguz.coinstats.data.apimodel.coin.Coins
import com.ozancanguz.coinstats.data.apiservice.CoinApiService
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val coinApiService: CoinApiService) {


    suspend fun getCoinList():Response<Coins>{
        return coinApiService.getCoins()
    }
}