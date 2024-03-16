package com.brytcode.simpleimage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired
    private Environment environment;
    @GetMapping("/info")
    public String getInfo(){
        return "Simple Image Demo from " + environment.getProperty("local.server.port");
    }
}
