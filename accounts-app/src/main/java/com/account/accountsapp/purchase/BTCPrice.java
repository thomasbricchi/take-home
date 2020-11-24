package com.account.accountsapp.purchase;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BTCPrice {

    private BigDecimal price;
    private String timestamp;

    public BTCPrice() {
    }

    public BTCPrice(BigDecimal price, String timestamp) {
        super();
        this.price = price;
        this.timestamp = timestamp;
    }
}
