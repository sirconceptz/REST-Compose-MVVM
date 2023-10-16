package com.hermanowicz.restcomposemvvm.di.repository

import com.hermanowicz.restcomposemvvm.data.repository.CurrencyRepositoryImpl
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    suspend fun getCurrencyRates(): Flow<CurrencyRates>
}

@Module
@InstallIn(SingletonComponent::class)
abstract class CurrencyRepositoryModule {

    @Binds
    abstract fun bindCurrencyRepository(
        currencyRepositoryImpl: CurrencyRepositoryImpl
    ): CurrencyRepository
}
