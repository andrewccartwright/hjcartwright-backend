package com.andrewccartwright.hjcartwright_backend;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/api_key")
    @CrossOrigin(allowedHeaders = "*", exposedHeaders = "*", origins = {"http://localhost:3000", "https://hjcartwright.*"})
    public ResponseEntity<String> getApiKey() {
        return ResponseEntity.ok(System.getenv("INSTAGRAM_API_KEY"));
    }
}
