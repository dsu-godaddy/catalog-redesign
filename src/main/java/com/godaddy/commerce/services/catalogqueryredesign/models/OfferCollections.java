package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class OfferCollections {
    private int matches;
    private List<OfferCollection> offerCollections;
}
