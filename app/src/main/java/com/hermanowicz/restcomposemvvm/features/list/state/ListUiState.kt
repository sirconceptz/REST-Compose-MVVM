package com.hermanowicz.restcomposemvvm.features.list.state

import com.hermanowicz.restcomposemvvm.model.CurrencyRates

data class ListUiState(
    val currencyRates: CurrencyRates? = null
)