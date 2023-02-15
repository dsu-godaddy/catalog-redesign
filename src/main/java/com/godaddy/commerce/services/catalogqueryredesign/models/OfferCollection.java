package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class OfferCollection {
    private String offerCollectionId;
    private String version;
    private String uri;
    private String resourceType;
    private Price pricing;
    private List<Offer> offers;
}
