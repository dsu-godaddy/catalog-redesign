package com.godaddy.commerce.services.catalogqueryredesign.models.dto;

import com.godaddy.commerce.services.catalogqueryredesign.models.Addon;
import com.godaddy.commerce.services.catalogqueryredesign.models.Config;
import com.godaddy.commerce.services.catalogqueryredesign.models.Term;
import lombok.Data;

@Data
public class GetTransition {
    private String marketId;
    private String paidThrough;
    private String offerId;
    private Term term;
    private Addon addons;
    private Config config;
}
