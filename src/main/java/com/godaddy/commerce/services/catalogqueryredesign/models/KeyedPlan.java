package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

@Data
public class KeyedPlan {
    private String key;
    private Plan plan;
}
