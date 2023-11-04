package com.shoppingcart.app.model;

import com.fasterxml.jackson.annotation.*;

public class CurrencyData {
    @JsonRawValue
    private CurrencyInfo currencyInfo;

    public CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }
}
