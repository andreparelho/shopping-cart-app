package com.shoppingcart.app.httpClient.Currency;

import com.shoppingcart.app.model.CurrencyInfoModel;

import java.util.Map;

public interface CurrencyGateway {
    Map<String, CurrencyInfoModel> getCurrencyData(String currency) throws Exception;
}
