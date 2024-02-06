package com.example.designpattern.creational.prototype;

public abstract class Pizza {
    private String name;
    private String size;
    private int price;

    public Pizza() {
    }

    public Pizza(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Pizza(Pizza pizza) {
        this.name = pizza.getName();
        this.size = pizza.getSize();
        this.price = pizza.getPrice();
    }

    public abstract Pizza clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pizza)) return false;
        Pizza pizza2 = (Pizza) o;
        return this.name.equals(pizza2.name) && this.size.equals(pizza2.size) && this.price == pizza2.price;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

