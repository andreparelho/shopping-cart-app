package com.shoppingcart.app.httpClient.Currency;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.shoppingcart.app.model.CurrencyInfo;

import java.util.Map;

public class CurrencyInfoMap {
    private final Map<String, CurrencyInfo> currencyInfoMap;

    public CurrencyInfoMap(Map<String, CurrencyInfo> currencyInfoMap) {
        this.currencyInfoMap = currencyInfoMap;
    }

    @JsonAnySetter
    public void addCurrencyInfo(String currency, CurrencyInfo info) {
        this.currencyInfoMap.put(currency, info);
    }

    public Map<String, CurrencyInfo> getCurrencyMap(){
        return this.currencyInfoMap;
    }
}
