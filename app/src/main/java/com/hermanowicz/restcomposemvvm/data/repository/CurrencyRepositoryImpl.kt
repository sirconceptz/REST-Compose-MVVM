package com.hermanowicz.restcomposemvvm.data.repository

import com.hermanowicz.restcomposemvvm.di.remote.dataSource.CurrencyRemoteDataSource
import com.hermanowicz.restcomposemvvm.di.repository.CurrencyRepository
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CurrencyRepositoryImpl @Inject constructor(
    private val remoteDataSource: CurrencyRemoteDataSource
) : CurrencyRepository {
    override suspend fun getCurrencyRates(): Flow<Response<CurrencyRates>> {
        return remoteDataSource.getCurrencyRates()
    }
}