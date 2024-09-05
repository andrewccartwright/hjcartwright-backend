package com.andrewccartwright.hjcartwright_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://hjcartwright.com")
public class Controller {
    
    @GetMapping("/api_key")
    public String getKey() {
        return System.getenv("INSTAGRAM_API_KEY");
    }
}
