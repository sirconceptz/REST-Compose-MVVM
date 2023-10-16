package com.hermanowicz.restcomposemvvm.di.remote

import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface Api {

    @GET("latest.json")
    suspend fun observeCurrencyRates(@Query("app_id") apiKey: String): CurrencyRates
}