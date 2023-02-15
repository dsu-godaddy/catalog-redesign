package com.godaddy.commerce.services.catalogqueryredesign.models;

import lombok.Value;

import java.util.List;

@Value
public class Transitions {
    private int matches;
    List<Offer> offers;
}
