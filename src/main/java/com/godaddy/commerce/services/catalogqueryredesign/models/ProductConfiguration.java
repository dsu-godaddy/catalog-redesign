package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Data;

import java.util.List;

@Data
public class ProductConfiguration {
    List<ProductConfigurationAddon> addons;
}
