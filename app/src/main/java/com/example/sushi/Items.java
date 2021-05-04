package com.example.sushi;

import java.util.ArrayList;

public class Items {
    public Items(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<String > items=new ArrayList<String>();

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
