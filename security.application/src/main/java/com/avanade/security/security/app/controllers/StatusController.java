package com.avanade.security.security.app.controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StatusController {

    @GetMapping("/api/ping")
    public String ping() {
        return "pong";
    }
}
