package com.brytcode.bos;

public class Barista {
    private int id;
    private String name;

    public Barista(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barista{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
