package com.hermanowicz.restcomposemvvm.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hermanowicz.restcomposemvvm.model.SingleCurrency

@Composable
fun CardPrimary(
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 4.dp
            )
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        ) {
            content()
        }
    }
}

@Composable
fun CurrencyItem(singleCurrency: SingleCurrency) {
    CardPrimary {
        Column(modifier = Modifier.fillMaxWidth().padding(4.dp)) {
            Text(singleCurrency.name)
            Text(singleCurrency.rate.toString())
        }
    }
}