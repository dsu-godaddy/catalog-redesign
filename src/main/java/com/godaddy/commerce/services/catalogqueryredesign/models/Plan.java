package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.HashMap;

@Data
public class Plan extends HashMap<String, String> {
    private String planId;
    private String version;
    private String uri;
    private String name;
    private String productFamily;
    private String resourceType;

    private Addon addons;
    private ProductConfiguration productConfiguration;
}
