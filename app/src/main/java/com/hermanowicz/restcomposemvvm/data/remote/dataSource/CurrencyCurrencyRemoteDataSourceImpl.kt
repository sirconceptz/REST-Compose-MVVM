package com.hermanowicz.restcomposemvvm.data.remote.dataSource

import com.hermanowicz.restcomposemvvm.Constants
import com.hermanowicz.restcomposemvvm.di.remote.Api
import com.hermanowicz.restcomposemvvm.di.remote.dataSource.CurrencyRemoteDataSource
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import retrofit2.Response
import javax.inject.Inject

class CurrencyCurrencyRemoteDataSourceImpl @Inject constructor(
    private val api: Api
) : CurrencyRemoteDataSource {
    override suspend fun getCurrencyRates(): Flow<Response<CurrencyRates>> {
        return flowOf(api.observeCurrencyRates(Constants.API_KEY))
    }
}