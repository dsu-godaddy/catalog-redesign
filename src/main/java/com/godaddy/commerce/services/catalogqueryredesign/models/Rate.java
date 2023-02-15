package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

@Data
public class Rate {
    private int discountPrice;
    private int offerPrice;
    private int renewalOfferPrice;
    private int renewalDiscountPrice;
}
