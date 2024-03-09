package com.brytcode.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryInfoController {
    @GetMapping("info")
    public String getInfo(){
        return "Welcome to Inventory Service";
    }
}
