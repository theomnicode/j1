package com.brytcode.sales.controller.feignclients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="inventory")
public interface InventoryClient {
    @GetMapping("/info")
    @CircuitBreaker(name="inventory", fallbackMethod = "getInventoryFallback")
    public String getInventory();
    default String getInventoryFallback(Throwable ex){
        return "Circulate - Opened because "+ex.getMessage();
    }
}
