package com.hermanowicz.restcomposemvvm.data.mapper

import com.hermanowicz.restcomposemvvm.model.Rates
import com.hermanowicz.restcomposemvvm.model.SingleCurrency

fun Rates.toSingleCurrencyList()  = listOf(
    SingleCurrency(name = "AED", this.AED),
    SingleCurrency(name = "AUD", this.AUD),
    SingleCurrency(name = "BHD", this.BHD),
    SingleCurrency(name = "CAD", this.CAD),
    SingleCurrency(name = "CHF", this.CHF),
    SingleCurrency(name = "CNY", this.CNY),
    SingleCurrency(name = "EUR", this.EUR),
    SingleCurrency(name = "GBP", this.GBP),
    SingleCurrency(name = "ILS", this.ILS),
    SingleCurrency(name = "JOD", this.JOD),
    SingleCurrency(name = "JPY", this.JPY),
    SingleCurrency(name = "KWD", this.KWD),
    SingleCurrency(name = "NOK", this.NOK),
    SingleCurrency(name = "NZD", this.NZD),
    SingleCurrency(name = "OMR", this.OMR),
    SingleCurrency(name = "PLN", this.PLN),
    SingleCurrency(name = "SEK", this.SEK),
    SingleCurrency(name = "TRY", this.TRY),
    SingleCurrency(name = "UAH", this.UAH),
    SingleCurrency(name = "ZAR", this.ZAR),
)