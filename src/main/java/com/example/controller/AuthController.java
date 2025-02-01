
package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/register")
    public String register() {
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login() {
        return "JWT Token";
    }
}
