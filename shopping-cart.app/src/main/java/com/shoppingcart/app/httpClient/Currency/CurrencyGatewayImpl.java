package com.shoppingcart.app.httpClient.Currency;

import com.shoppingcart.app.model.CurrencyInfoModel;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyGatewayImpl implements CurrencyGateway {
    private CurrencyInfoModel currencyInfoModel;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String urlApi = "https://economia.awesomeapi.com.br/last/USD-";

    @Autowired
    public CurrencyGatewayImpl(CurrencyInfoModel currencyInfoModel, RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.currencyInfoModel = currencyInfoModel;
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public Map<String, CurrencyInfoModel> getCurrencyData(String currency){
        String url = this.urlApi + currency;
        String response = this.restTemplate.getForObject(url, String.class);

        try {
            return this.objectMapper.readValue(response, CurrencyInfoMap.class).getCurrencyMap();
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

}
