package com.hermanowicz.restcomposemvvm.features.list.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.hermanowicz.restcomposemvvm.components.card.CurrencyItem
import com.hermanowicz.restcomposemvvm.model.SingleCurrency

@Composable
fun ListScreen(
    viewModel: ListViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn () {
        if(uiState.currencyRates != null) {
            item {
                CurrencyItem(SingleCurrency("AED", uiState.currencyRates!!.rates.AED))
            }
        }
    }
}