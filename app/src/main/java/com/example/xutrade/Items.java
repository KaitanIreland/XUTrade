package com.example.xutrade;

import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items;
    private ArrayList<Integer> indexList;

    public Items() {
        items = new ArrayList<>();
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return items.toString();
    }

    public void add(Item i) {
        items.add(i);
    }

    public Item get(int index) {
        return items.get(index);
    }

    public void removeItem(int index) {
        items.remove(items.get(index));
    }

    public void swapItems(int index1, int index2) {
        Item iStore1 = items.get(index1);
        Item iStore2 = items.get(index2);
        Item temp = items.get(index1);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == iStore1) {
                items.set(i, iStore2);
                if (items.get(i) == iStore2) {
                    items.set(i, temp);
                }
            }
        }
    }

    public void setPrice(int index, double newPrice) {
        items.get(index).setPrice(newPrice);
    }

    //    TODO public ArrayList<Integer> invalidItems(){
//
//    }
    public double averagePrice() {
        int count = 0;
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
            count = count + 1;
        }
        return total / count;
    }

    public int averagePrice(String ownerName) {
        int numOfItems = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getOwner().equals(ownerName)) {
                numOfItems = numOfItems + 1;
            }
        }
        return numOfItems;
    }

    public ArrayList<Item> itemsBy(String ownerName) {
        ArrayList<Item> listOfItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getOwner().equals(ownerName)) {
                listOfItems.add(items.get(i));
            }
        }
        return listOfItems;
    }

}
