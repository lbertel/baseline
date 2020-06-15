package io.ps.web.controller.healthcheck;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class HealthCheckGetController {

    @GetMapping("/health-check")
    @Operation(summary = "check if the application is active")
    @ApiResponse(
        responseCode = "200",
        description = "application ok",
        content = @Content
    )
    public HashMap<String, String> handle(){
        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");

        return status;
    }
}
