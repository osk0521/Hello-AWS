package com.sprata.postapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world");
    }
}