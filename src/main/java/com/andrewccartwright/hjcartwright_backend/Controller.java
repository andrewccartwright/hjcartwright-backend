package com.andrewccartwright.hjcartwright_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/api_key")
    public String getApiKey() {
        return System.getenv("INSTAGRAM_API_KEY");
    }
}
