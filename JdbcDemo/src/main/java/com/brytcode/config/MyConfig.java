package com.brytcode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyConfig {
    @Bean("myDepts")
    Map<String,String> depts(){
        Map<String, String> depts = new HashMap<>();
        depts.put("SALES","Kumar");
        depts.put("HR","Kalyan");
        return depts;
    }
}
