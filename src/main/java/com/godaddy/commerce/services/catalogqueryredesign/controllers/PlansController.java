package com.godaddy.commerce.services.catalogqueryredesign.controllers;

import com.godaddy.commerce.services.catalogqueryredesign.models.Plan;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.*;

@RestController(value = "Plans")
@Tag(name = "Catalog")
@RequestMapping(value = "/catalog", produces = "application/json")
public class PlansController {
    @GetMapping("/plans/{planId}")
    @Operation(summary = """
    Get the details and attributes for the specified plan Id""")
    @ApiResponse(responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Plan.class),
                    examples = {
                    }))
    public Plan getPlan(
            @Parameter(description = "Plan Id") @PathVariable String planId,
            @Parameter(description = "Version number") @RequestParam String version) {
        throw new NotImplementedException();
    }
}
