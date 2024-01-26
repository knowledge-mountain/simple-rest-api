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

    @GetMapping("simple/second")
    public ResponseEntity<String> getSecondSimpleExample() {
        return ResponseEntity.ok("Second simple example");
    }

    @GetMapping("simple/third")
    public ResponseEntity<String> getThirdSimpleExample() {
        return ResponseEntity.ok("Third simple example");
    }

    @GetMapping("simple/fourth")
    public ResponseEntity<String> getfourthSimpleExample() {
        return ResponseEntity.ok("Third simple example");
    }
}
