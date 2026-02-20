package org.example.enums;

public enum Plan {

    BASIC("Basic", 100.0),
    PREMIUM("Premium", 200.0),
    VIP("VIP", 300.0);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}