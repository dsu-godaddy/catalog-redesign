package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

@Data
public class Term {
    private TermType termType;
    private double numberOfTerms;
    private Boolean isDefault;
}
