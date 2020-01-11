package com.satya.SpringCloudEurekaservertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProducerController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello from producer for service registry test. " + new Date();
    }
}
