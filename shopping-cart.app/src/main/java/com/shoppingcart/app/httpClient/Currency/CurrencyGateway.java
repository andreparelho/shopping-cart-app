package com.shoppingcart.app.httpClient.Currency;

import com.shoppingcart.app.model.CurrencyInfo;

import java.util.Map;

public interface CurrencyGateway {
    Map<String, CurrencyInfo> getCurrencyData(String currency) throws Exception;
}
