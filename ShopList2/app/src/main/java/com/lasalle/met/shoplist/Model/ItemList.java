package com.lasalle.met.shoplist.Model;

import com.lasalle.met.shoplist.Controller.MainActivity;

/**
 * Created by FurruPi on 20/12/17.
 */

public class ItemList {
    private String name;
    private int cantidad;

    public ItemList(String name, int cantidad) {
        this.name = name;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
