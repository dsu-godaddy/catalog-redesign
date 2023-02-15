package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class OfferInstance {
    private String offerId;
    private TermType term;
    private List<Config> config;
    private Addon addons;
}
