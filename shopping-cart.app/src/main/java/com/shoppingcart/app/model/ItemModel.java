package com.shoppingcart.app.model;

import java.math.BigDecimal;

public class ItemModel {
    private BigDecimal amount;
    private int quantity;

    public BigDecimal getSubtotal(){
        return this.amount.multiply(BigDecimal.valueOf(this.quantity));
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
