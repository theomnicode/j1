package com.brytcode.sales.controller;

import com.brytcode.sales.controller.feignclients.InventoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SalesInfoController {
    @Autowired
    InventoryClient inventoryClient;
    @GetMapping("/info")
    public String getInfo(){
//        RestTemplate inventory = new RestTemplate();
//        ResponseEntity<String> inventoryResponse = inventory.exchange("http://172.24.144.1:9090/inventory/inventory/info", HttpMethod.GET, null, String.class );

        return "Welcome to Sales Service -> "+inventoryClient.getInventory();//inventoryResponse.getBody();
    }
}
