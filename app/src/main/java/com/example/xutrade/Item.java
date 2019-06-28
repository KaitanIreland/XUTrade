package com.example.xutrade;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

public class Item {
    private int id;
    private String username;
    private String name;
    private String owner;
    private String condition;
    private Double price;

    public Item() {
        id = 0;
        username = "jhopkins@xula.edu";
        name = "Chair";
        owner = "John";
        condition = "Good";
        price = 13.50;
    }

    public Item(int id, String username, String name, String owner, String condition, Double price) {
        boolean isUserNameCorrect = username.endsWith("@xula.edu");
        this.id = id;
        if (isUserNameCorrect) {
            this.username = username;
        } else {
            this.username = username + "@xula.edu";
        }
        this.name = name;
        this.owner = owner;
        this.condition = condition;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Item: " +
                "- " + id +
                " - " + username + '\'' +
                " - " + name + '\'' +
                " - " + owner + '\'' +
                " - " + condition + '\'' +
                " - " + price +
                '.';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        boolean isUserNameCorrect = username.endsWith("@xula.edu");
        if (isUserNameCorrect) {
            this.username = username;
        } else {
            this.username = username + "@xula.edu";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setItem(int newID, String newUsername, String newName, String newOwner, String newCondition, Double newPrice) {
        boolean isUserNameCorrect = username.endsWith("@xula.edu");
        this.id = newID;
        if (isUserNameCorrect) {
            this.username = username;
        } else {
            this.username = username + "@xula.edu";
        }
        this.username = newUsername;
        this.name = newName;
        this.owner = newOwner;
        this.condition = newCondition;
        this.price = newPrice;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(username, item.username) &&
                Objects.equals(name, item.name) &&
                Objects.equals(owner, item.owner) &&
                Objects.equals(condition, item.condition) &&
                Objects.equals(price, item.price);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(id, username, name, owner, condition, price);
    }
}