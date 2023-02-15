package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

@Data
public class Price {
    private String action;
    private String currency;
    private Rate rates;
}
