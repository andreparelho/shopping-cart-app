package com.shoppingcart.app.httpClient.Currency;

import com.shoppingcart.app.model.CurrencyResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Service
public class CurrencyGatewayImpl implements CurrencyGateway {
    private CurrencyResponseModel currencyResponse;
    private final RestTemplate restTemplate;
    private final String urlApi = "https://economia.awesomeapi.com.br/last/USD-";

    @Autowired
    public CurrencyGatewayImpl(CurrencyResponseModel currencyResponse, RestTemplate restTemplate) {
        this.currencyResponse = currencyResponse;
        this.restTemplate = restTemplate;
    }

    @Override
    public Map<String, BigDecimal> getCurrency(String currency) throws Exception {
        currency = currency.toUpperCase();
        this.currencyResponse = this.restTemplate.getForObject(this.urlApi + currency, CurrencyResponseModel.class);

        if (this.currencyResponse == null) throw new Exception("Erro ao realizar a requisição");

        Map<String, BigDecimal> actualCurrency = new HashMap<>();
        actualCurrency.put(this.currencyResponse.getObject(), new BigDecimal (this.currencyResponse.getObject()));

        return actualCurrency;
    }
}
