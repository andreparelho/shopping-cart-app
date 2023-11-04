package com.shoppingcart.app.httpClient.Currency;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.shoppingcart.app.model.CurrencyInfoModel;

import java.util.Map;

public class CurrencyInfoMap {
    private final Map<String, CurrencyInfoModel> currencyInfoMap;

    public CurrencyInfoMap(Map<String, CurrencyInfoModel> currencyInfoMap) {
        this.currencyInfoMap = currencyInfoMap;
    }

    @JsonAnySetter
    public void addCurrencyInfo(String currency, CurrencyInfoModel info) {
        this.currencyInfoMap.put(currency, info);
    }

    public Map<String, CurrencyInfoModel> getCurrencyMap(){
        return this.currencyInfoMap;
    }
}
