package ru.timka.diplomishe.model;

public class Product {
    private final String id;
    private final String name;
    private final double price;
    private final String store;
    private final String category;

    public Product(String id, String name, double price, String store, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
        this.category = category;
    }

    // Геттеры
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getStore() { return store; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("%s - %.2f руб. (%s)", name, price, store);
    }
}