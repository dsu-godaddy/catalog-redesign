package com.godaddy.commerce.services.catalogqueryredesign.models.dto;

import com.godaddy.commerce.services.catalogqueryredesign.models.Term;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GetOffer {
    @NotNull
    private String marketId;
    private Term term;
}
