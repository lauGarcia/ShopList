package com.lasalle.met.shoplist.Controller;

import com.lasalle.met.shoplist.Model.ItemList;

import java.util.ArrayList;

/**
 * Created by FurruPi on 20/12/17.
 */

public class MainActivityManager {
    private ArrayList<ItemList> itemLists;

    public MainActivityManager() {
        this.itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Arroz",2));
        itemLists.add(new ItemList("Pan",1));
    }

    public ArrayList<ItemList> getItemLists() {
        return itemLists;
    }

    public void setItemLists(ArrayList<ItemList> itemLists) {
        this.itemLists = itemLists;
    }
}
