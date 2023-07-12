package com.example.dessignpattern.creational.prototype;

public class BulgogiPizza extends Pizza {
    private int bulgogiCount;

    public BulgogiPizza() {
    }

    public int getBulgogiCount() {
        return bulgogiCount;
    }

    public void setBulgogiCount(int bulgogiCount) {
        this.bulgogiCount = bulgogiCount;
    }

    public BulgogiPizza(BulgogiPizza bulgogiPizza) {
        super(bulgogiPizza);
        if (bulgogiPizza != null) {
            this.bulgogiCount = bulgogiPizza.bulgogiCount;
        }
    }

    @Override
    public BulgogiPizza clone() {
        return new BulgogiPizza(this);
    }

    @Override
    public String toString() {
        return "BulgogiPizza{" +
                "name=" + this.getName() +
                ", size=" + this.getSize() +
                ", price" + this.getPrice() +
                ", bulgogiCount=" + bulgogiCount +
                '}';
    }
}
