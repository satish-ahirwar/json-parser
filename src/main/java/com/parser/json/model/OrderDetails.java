package com.parser.json.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderDetails {
    private String id;
    private String orderNumber;
    private String orderTotal;
    List<Product> products;
}
