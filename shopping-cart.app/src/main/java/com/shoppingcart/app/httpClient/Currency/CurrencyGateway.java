package com.shoppingcart.app.httpClient.Currency;

import java.math.BigDecimal;
import java.util.Map;

public interface CurrencyGateway {
    Map<String, BigDecimal> getCurrency(String currency) throws Exception;
}
