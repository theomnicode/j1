package com.brytcode.bos;

import java.util.*;

public class OrdersAtDesk {
    private Queue<Order> orders = new LinkedList<>();

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

}
