package com.example.xutrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> arrayItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        arrayItems = new ArrayList<>();
//        arrayItems.add(new Item(12, "hhussein","Haaris", "Hamid", "Poor", 12.54));
        Item it = new Item();
        Item it1 = new Item(12, "hhussein", "Haaris", "Hamid", "Poor", 12.54);
        System.out.println("Default: " + it);
        System.out.println("Parameterized " + it1);
        System.out.println("Test String " + it1.toString());
        it1.setItem(34, "kireland", "Kaitan", "Thepowersthatbe", "Great", 34.78);
        System.out.println("Test set item: " + it1);
        Item item1 = new Item(3, "jbridges", "Sofa", "Jared", "Good", 56.89);
        Item item2 = new Item(9, "bwilliams", "Economics Textbook", "Bernice", "Poor", 40.52);
        Item item3 = new Item(13, "lsmith", "Makeup", "Linda", "Excellent", 30.94);
        Item item4 = new Item(5, "jbridges", "T shirt", "Jared", "Poor", 5.43);
        Item item5 = new Item(2, "mhans", "Bicycle", "Michael", "Poor", 20.67);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);
        Items listItems = new Items();
        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);
        listItems.add(item5);
        System.out.println("\nDefault list: " + listItems.toString());
        listItems.swapItems(0, 1);
        //  todo Invalid items test
        System.out.println("\nSwap Items test (index 0 and 1): " + listItems.toString());
        listItems.setPrice(2, 10.00);
        System.out.println("\nSet price test ($10.00 index 3): " + listItems.toString());
        ArrayList<Item> itemsByOwnerList = new ArrayList<>();
        itemsByOwnerList = (listItems.itemsBy("Jared"));
        System.out.println("\nAll items by owner Jared: " + itemsByOwnerList);

    }
}
