package com.example.xutrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

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
        Item item4 = new Item(5, "jedwards", "T shirt", "Jay", "Poor", 5.43);
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

    }
}
