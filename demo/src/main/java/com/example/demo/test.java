package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class test {
    @GetExchange("/")
    public ResponseEntity<?> testing(){
        return ResponseEntity.ok().body("prueba texto");
    }
}
