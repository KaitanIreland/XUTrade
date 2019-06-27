package com.example.xutrade;

import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items;

    public Items() {
        items = new ArrayList<>();
    }

    public int size() {
        return items.size();
    }

    public void add(Item i) {
        items.add(i);
    }
}
