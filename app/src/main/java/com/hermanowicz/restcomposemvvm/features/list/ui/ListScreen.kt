package com.hermanowicz.restcomposemvvm.features.list.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.hermanowicz.restcomposemvvm.components.card.CurrencyItem
import com.hermanowicz.restcomposemvvm.model.SingleCurrency

@Composable
fun ListScreen(
    viewModel: ListViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        item {
            Text("Currency list", color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
        }
        item {
            uiState.currencyList.forEach {
                CurrencyItem(it)
            }
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}