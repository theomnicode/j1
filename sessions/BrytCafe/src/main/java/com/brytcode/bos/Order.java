package com.brytcode.bos;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Order {
    private static long idGenerator = 0;
    private long id;
    private Date orderDate;
    private Set<Product> products = new HashSet<>();
    private Customer customer;
    public Order() {
        id = ++idGenerator;
        orderDate = new Date();
    }
    public Order(Customer customer) {
        this();
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod){
        this.products.add(prod);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
