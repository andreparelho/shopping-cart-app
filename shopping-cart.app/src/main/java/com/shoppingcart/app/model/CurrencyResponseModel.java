package com.shoppingcart.app.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class CurrencyResponseModel implements Serializable {
    private String object;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
