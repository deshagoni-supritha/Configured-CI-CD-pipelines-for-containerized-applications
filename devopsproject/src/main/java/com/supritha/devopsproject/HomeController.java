package com.supritha.devopsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Enterprise DevOps Project Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Healthy";
    }
}