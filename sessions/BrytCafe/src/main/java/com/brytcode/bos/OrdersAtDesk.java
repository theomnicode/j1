package com.brytcode.bos;

import java.util.*;

public class OrdersAtDesk {
    private Queue<Order> orders = new LinkedList<>();
    private Map<Order, Barista> servings = new HashMap<>();

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    public Map<Order, Barista> getServings() {
        return servings;
    }

    public void setServings(Map<Order, Barista> servings) {
        this.servings = servings;
    }
}
