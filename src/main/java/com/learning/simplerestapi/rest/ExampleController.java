package com.learning.simplerestapi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {
    @GetMapping("simple")
    public ResponseEntity<String> getSimpleExample() {
        return ResponseEntity.ok("Simple Example");
    }
}
