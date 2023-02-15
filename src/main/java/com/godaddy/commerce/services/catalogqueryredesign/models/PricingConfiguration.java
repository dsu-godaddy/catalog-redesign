package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class PricingConfiguration {
    private String currency;
    private List<String> discountCodes;
    private String isc;
}
