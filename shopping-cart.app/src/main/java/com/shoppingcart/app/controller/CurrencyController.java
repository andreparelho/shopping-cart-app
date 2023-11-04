package com.shoppingcart.app.controller;

import com.shoppingcart.app.model.CurrencyDataModel;
import com.shoppingcart.app.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/{currency}")
    public ResponseEntity<Map<String, CurrencyDataModel>> getCurrency(@PathVariable String currency) throws Exception {
        ResponseEntity<Map<String, CurrencyDataModel>> response;
        response = (ResponseEntity<Map<String, CurrencyDataModel>>) this.currencyService.getCurrency(currency);
        return response;
    }
}
