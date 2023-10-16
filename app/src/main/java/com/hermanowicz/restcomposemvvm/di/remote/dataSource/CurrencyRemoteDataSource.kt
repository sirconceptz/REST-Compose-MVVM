package com.hermanowicz.restcomposemvvm.di.remote.dataSource

import com.hermanowicz.restcomposemvvm.data.remote.dataSource.CurrencyRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

interface RemoteDataSource {

}

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(
        currencyRemoteDataSourceImpl: CurrencyRemoteDataSourceImpl
    ): RemoteDataSource
}