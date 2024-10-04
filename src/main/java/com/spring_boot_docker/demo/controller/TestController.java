package com.spring_boot_docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to Spring Boot Docker Application";
    }
}
