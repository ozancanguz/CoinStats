package com.ozancanguz.coinstats.data.apimodel.coin

data class Coin(
    val availableSupply: Int,
    val contractAddress: String,
    val decimals: Int,
    val exp: List<String>,
    val icon: String,
    val id: String,
    val marketCap: Double,
    val name: String,
    val price: Double,
    val priceBtc: Int,
    val priceChange1d: Int,
    val priceChange1h: Double,
    val priceChange1w: Double,
    val rank: Int,
    val redditUrl: String,
    val symbol: String,
    val totalSupply: Int,
    val twitterUrl: String,
    val volume: Double,
    val websiteUrl: String
)