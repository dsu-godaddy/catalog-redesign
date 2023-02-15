package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Value;

@Value
public class ProductConfigurationAddon {
    private String addonId;
    private String name;
    private boolean isDefault;
    private boolean isConfigurable;
}
