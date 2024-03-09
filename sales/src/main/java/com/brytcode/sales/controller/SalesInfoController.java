package com.brytcode.sales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SalesInfoController {
    @GetMapping("info")
    public String getInfo(){
        return "Welcome to Sales Service";
    }
}
