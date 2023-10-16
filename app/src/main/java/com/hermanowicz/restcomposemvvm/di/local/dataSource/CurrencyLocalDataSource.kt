package com.hermanowicz.restcomposemvvm.di.local.dataSource

import com.hermanowicz.restcomposemvvm.data.local.dataSource.CurrencyLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

interface LocalDataSource {

}

@Module
@InstallIn(SingletonComponent::class)
abstract class CurrencyLocalDataSourceModule {

    @Binds
    abstract fun bindCurrencyLocalDataSource(
        currencyRemoteDataSourceImpl: CurrencyLocalDataSourceImpl
    ): LocalDataSource
}