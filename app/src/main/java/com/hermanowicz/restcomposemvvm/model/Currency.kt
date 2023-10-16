package com.hermanowicz.restcomposemvvm.model

data class Currency(
    val code: String,
    val countryName: String,
    val symbol: String,
    val rate: Double
)