package com.example.sushi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Locale;

public class Order extends AppCompatActivity {
Items order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        order.items.add("item 1");
        order.items.add("item 2");
        order.items.add("item 3");
        order.items.add("item 4");
        order.items.add("item 5");
        order.items.add("item 6");
        order.items.add("item 7");


    }
}