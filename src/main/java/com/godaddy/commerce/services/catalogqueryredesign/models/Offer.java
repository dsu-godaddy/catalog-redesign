package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class Offer {
    private String offerId;
    private String version;
    private String uri;
    private boolean autoRenew;
    private String resourceType;
    List<KeyedPlan> plans;
    private BillingPolicyOverride billingPolicyOverride;
    private List<Term> allowedTerms;
    // Rename this later
    private OfferInstance instance;
}
