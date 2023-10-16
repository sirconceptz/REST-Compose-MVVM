package com.hermanowicz.restcomposemvvm.data.repository

import com.hermanowicz.restcomposemvvm.Constants
import com.hermanowicz.restcomposemvvm.di.remote.Api
import com.hermanowicz.restcomposemvvm.di.repository.CurrencyRepository
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CurrencyRepositoryImpl @Inject constructor(
    private val api: Api
) : CurrencyRepository {
    override suspend fun getCurrencyRates(): Flow<CurrencyRates> {
        return flowOf(api.observeCurrencyRates(Constants.API_KEY))
    }
}