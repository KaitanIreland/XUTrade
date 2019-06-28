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

    public Item get(int index) {
        return items.get(index);
    }

    public void setPrice(int index, double newPrice) {
        Item i = new Item();
        for (int j = 0; j < items.size(); j++) {
            if (j == index) {
                i = items.get(index);
            }
        }
        i.setPrice(newPrice);
    }
}
