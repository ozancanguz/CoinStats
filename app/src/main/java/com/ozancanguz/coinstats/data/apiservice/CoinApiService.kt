package com.ozancanguz.coinstats.data.apiservice

import com.ozancanguz.coinstats.data.apimodel.coin.Coins
import retrofit2.Response
import retrofit2.http.GET

interface CoinApiService {

    @GET("/coins?skip=0&limit=100")
    suspend fun getCoins(): Response<Coins>
}