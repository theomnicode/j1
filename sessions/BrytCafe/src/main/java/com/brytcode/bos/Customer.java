package com.brytcode.bos;

import java.util.Objects;

public class Customer {
    private static int id_runner;
    private int id;
    private String name;
    private String mobileNumber;

    public Customer(String mobileNumber) {
        this.id = ++id_runner;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(mobileNumber, customer.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileNumber);
    }
}
