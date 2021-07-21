package com.chucksmith;

import java.time.LocalDateTime;

public class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    public Order(String orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
        createdDate = LocalDateTime.now();
    }

    //your code goes here, do not change any existing code

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}
