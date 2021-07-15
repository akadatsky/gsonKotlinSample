package com.akadatsky.gsonsample.model

data class ExchangeRate(
    val baseCurrency: String?,
    val currency: String?,
    val purchaseRate: Double?,
    val purchaseRateNB: Double?,
    val saleRate: Double?,
    val saleRateNB: Double?
)