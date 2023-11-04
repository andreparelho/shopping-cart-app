package com.shoppingcart.app.model;

import com.fasterxml.jackson.annotation.*;

public class CurrencyDataModel {
    @JsonRawValue
    private CurrencyInfoModel currencyInfoModel;

    public CurrencyInfoModel getCurrencyInfo() {
        return currencyInfoModel;
    }
}
