package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

@Data
public class BillingPolicyOverride {
    private String planType;
    private TrialInfo trialInfo;
}
