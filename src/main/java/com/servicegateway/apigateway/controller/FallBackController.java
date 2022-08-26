package com.servicegateway.apigateway.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/cardServiceFallBack")
    public String cardServiceFallBack() {
        return "Card service is not responding. Please try after sometime.";
    }

    @GetMapping("/statementServiceFallBack")
    public String statementServiceFallBack() {
        return "Statement service is not responding. Please try after sometime.";
    }

    @GetMapping("/cardStatementServiceFallBack")
    public String cardStatementServiceFallBack() {
        return "Card statement service is not responding. Please try after sometime.";
    }
}
