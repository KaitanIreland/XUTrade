package com.example.xutrade;

public class Item {
    private int id;
    private String username;
    private String name;
    private String owner;
    private String condition;
    private Double price;

    public Item() {
        String format = "@xula.edu";
        id = 0;
        username = "jhopkins" + format;
        name = "Chair";
        owner = "John";
        condition = "Good";
        price = 13.50;
    }

    public Item(int id, String username, String name, String owner, String condition, Double price) {
        String format = "@xula.edu";
        this.id = id;
        this.username = username + format;
        this.name = name;
        this.owner = owner;
        this.condition = condition;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", condition='" + condition + '\'' +
                ", price=" + price +
                '}';
    }

    public int getItem() {
        return id;
    }
}