package com.godaddy.commerce.services.catalogqueryredesign.controllers;

import com.godaddy.commerce.services.catalogqueryredesign.models.*;
import com.godaddy.commerce.services.catalogqueryredesign.models.dto.GetOffer;
import com.godaddy.commerce.services.catalogqueryredesign.models.dto.GetOffers;
import com.godaddy.commerce.services.catalogqueryredesign.models.dto.GetTransition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "Offers")
@Tag(name = "Catalog")
@RequestMapping(value = "/catalog", produces = "application/json")
public class OffersController {

    @PostMapping("/{privateLabelId}/offers/{offerId}")
    @Operation(summary = """
    Get the offer definition and instance for the specified offerId
    Can include plan details and pricing""")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "GetOffer Request object",
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                    }))
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Offer.class),
                    examples = {
                    }))
    public Offer getOffer(@Parameter(description = "Private Label Id") @PathVariable String privateLabelId,
                          @Parameter(description = "Offer Id") @PathVariable String offerId,
                          @Parameter(description = "Include plan details") @RequestParam(required = false, defaultValue = "false") Boolean planDetails,
                          @Parameter(description = "Include pricing") @RequestParam(required = false, defaultValue = "true") Boolean rateForDisplay,
                          @RequestBody(required = true) GetOffer offerRequest) {
        throw new NotImplementedException();
    }

    @PostMapping("/{privateLabelId}/offers")
    @Operation(summary = """
    Query the catalog for offers based on search criteria""")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "GetOffers Request object",
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                    }))
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Offers.class),
                    examples = {
                    }))
    public Offers getOffers(@Parameter(description = "Private Label Id") @PathVariable String privateLabelId,
                            @Parameter(description = "Include plan details") @RequestParam(required = false, defaultValue = "false") Boolean planDetails,
                            @Parameter(description = "Include pricing") @RequestParam(required = false, defaultValue = "true") Boolean rateForDisplay,
                            @RequestBody(required = true) GetOffers offersRequest) {
        throw new NotImplementedException();
    }

    @PostMapping("/{privateLabelId}/offerCollections/{offerCollectionId}")
    @Operation(summary = """
    Get the offer collection for the specified offerCollectionId""")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "GetOffer Request object",
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                    }))
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = OfferCollection.class),
                    examples = {
                    }))
    public OfferCollection getOfferCollection(@Parameter(description = "Private Label Id") @PathVariable String privateLabelId,
                                              @Parameter(description = "Offer Collection Id") @PathVariable String offerCollectionId,
                                              @Parameter(description = "Include plan details") @RequestParam(required = false, defaultValue = "false") Boolean planDetails,
                                              @Parameter(description = "Include pricing") @RequestParam(required = false, defaultValue = "true") Boolean rateForDisplay,
                                              @RequestBody(required = true) GetOffer offersRequest) {
        throw new NotImplementedException();
    }

    @PostMapping("/{privateLabelId}/offerCollections")
    @Operation(summary = """
    Query for offerCollections based on a certain criteria""")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "GetOffer Request object",
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                    }))
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = OfferCollections.class),
                    examples = {
                    }))
    public OfferCollections getOfferCollections(@Parameter(description = "Private Label Id") @PathVariable String privateLabelId,
                                                @Parameter(description = "Include plan details") @RequestParam(required = false, defaultValue = "false") Boolean planDetails,
                                                @Parameter(description = "Include pricing") @RequestParam(required = false, defaultValue = "true") Boolean rateForDisplay,
                                                @RequestBody(required = true) GetOffers offersRequest) {
        throw new NotImplementedException();
    }

    @PostMapping("/{privateLabelId}/offers/{offerId}/transitions")
    @Operation(summary = """
    Based on a current subscription fromOffer query the catalog for the transitions the subscription
    can transition to by plan or term""")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "GetOffer Request object",
            content = @Content(
                    mediaType = "application/json",
                    examples = {
                    }))
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Transitions.class),
                    examples = {
                    }))
    public Transitions getTransitions(@Parameter(description = "Private Label Id") @PathVariable String privateLabelId,
                                      @Parameter(description = "Offer Id") @PathVariable String offerId,
                                      @Parameter(description = "Include plan details") @RequestParam(required = false, defaultValue = "false") Boolean planDetails,
                                      @Parameter(description = "Include pricing") @RequestParam(required = false, defaultValue = "true") Boolean rateForDisplay,
                                      @Parameter(description = "Filter type of transition") @RequestParam(required = true) List<String> includes,
                                      @RequestBody(required = true) GetTransition transitionRequest) {
        throw new NotImplementedException();
    }
}
