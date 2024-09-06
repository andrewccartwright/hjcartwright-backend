package com.andrewccartwright.hjcartwright_backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/api_key")
    public ResponseEntity<String> getApiKey() {
        return ResponseEntity.ok(System.getenv("INSTAGRAM_API_KEY"));
    }
}
