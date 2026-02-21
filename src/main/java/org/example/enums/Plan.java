package org.example.enums;

public enum Plan {

    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200),
    VIP("VIP Plan", 300);

    private String name;
    private Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}