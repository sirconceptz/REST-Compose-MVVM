package com.hermanowicz.restcomposemvvm.domain

import com.hermanowicz.restcomposemvvm.di.repository.CurrencyRepository
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class GetCurrencyRatesUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) : suspend () -> Flow<Response<CurrencyRates>> {
    override suspend fun invoke(): Flow<Response<CurrencyRates>> {
        return currencyRepository.getCurrencyRates()
    }
}