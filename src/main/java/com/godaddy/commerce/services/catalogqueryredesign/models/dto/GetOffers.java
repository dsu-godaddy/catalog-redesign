package com.godaddy.commerce.services.catalogqueryredesign.models.dto;

import com.godaddy.commerce.services.catalogqueryredesign.models.PricingConfiguration;
import com.godaddy.commerce.services.catalogqueryredesign.models.Term;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class GetOffers {
    @NotNull
    private String marketId;
    private String curatedOfferId;
    private List<PlanFilter> planFilters;
    private Term term;
    PricingConfiguration pricingConfiguration;
}
