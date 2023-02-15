package com.godaddy.commerce.services.catalogqueryredesign.models.dto;

import lombok.Data;

import java.util.HashMap;

@Data
public class PlanFilter extends HashMap<String, String> {
    private String planId;
}
