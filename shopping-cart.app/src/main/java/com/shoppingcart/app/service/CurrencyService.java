package com.shoppingcart.app.service;

import com.shoppingcart.app.httpClient.Currency.CurrencyGateway;

import com.shoppingcart.app.model.CurrencyInfoModel;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CurrencyService {

    private final CurrencyGateway currencyGateway;

    public CurrencyService(CurrencyGateway currencyGateway) {
        this.currencyGateway = currencyGateway;
    }

    public Map<String, CurrencyInfoModel> getCurrency(String currency) throws Exception {
        return this.currencyGateway.getCurrencyData(currency);
    }
}
