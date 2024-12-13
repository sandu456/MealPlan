package com.example.mealsdelivery.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthonticationController {

    @PostMapping("/register")
    public String register(@RequestBody String user) {
        // Logic for registering a user
        return "User registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody String credentials) {
        // Logic for user login
        return "User logged in";
    }
}

