package com.brytcode.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryInfoController {

    @Autowired
    private Environment environment;
    int port;
    @GetMapping("info")
    public String getInfo(){
        return "Welcome to Inventory Service from " + environment.getProperty("local.server.port");
    }
}
