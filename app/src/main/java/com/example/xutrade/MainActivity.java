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

//        Item item1
//        Item item2
//        Item item3
//        Item item4
//        Item item5
    }
}
