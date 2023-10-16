package com.hermanowicz.restcomposemvvm.di.remote.dataSource

import com.hermanowicz.restcomposemvvm.data.remote.dataSource.CurrencyCurrencyRemoteDataSourceImpl
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface CurrencyRemoteDataSource {
    suspend fun getCurrencyRates(): Flow<Response<CurrencyRates>>
}

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(
        currencyRemoteDataSourceImpl: CurrencyCurrencyRemoteDataSourceImpl
    ): CurrencyRemoteDataSource
}