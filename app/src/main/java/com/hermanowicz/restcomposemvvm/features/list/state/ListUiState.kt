package com.hermanowicz.restcomposemvvm.features.list.state

import com.hermanowicz.restcomposemvvm.model.SingleCurrency

data class ListUiState(
    val currencyList: List<SingleCurrency> = emptyList()
)