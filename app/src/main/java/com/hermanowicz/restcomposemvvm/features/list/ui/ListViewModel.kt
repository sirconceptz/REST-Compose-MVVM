package com.hermanowicz.restcomposemvvm.features.list.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hermanowicz.restcomposemvvm.data.mapper.toSingleCurrencyList
import com.hermanowicz.restcomposemvvm.domain.GetCurrencyRatesUseCase
import com.hermanowicz.restcomposemvvm.features.list.state.ListUiState
import com.hermanowicz.restcomposemvvm.model.CurrencyRates
import com.hermanowicz.restcomposemvvm.model.SingleCurrency
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val getCurrencyRatesUseCase: GetCurrencyRatesUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(ListUiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getCurrencyRatesUseCase().collect {
                if(it.isSuccessful) {
                    updateCurrencyRatesState(it.body()!!.rates.toSingleCurrencyList())
                }
            }
        }
    }

    private fun updateCurrencyRatesState(currencyList: List<SingleCurrency>) {
        _uiState.update { it.copy(currencyList = currencyList) }
    }
}