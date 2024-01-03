package com.example.tugasbesarpbo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Order {

    private final SimpleStringProperty menu;
    private final SimpleIntegerProperty harga;

    public Order(String menu, int harga) {
        this.menu = new SimpleStringProperty(menu);
        this.harga = new SimpleIntegerProperty(harga);
    }

    public String getMenu() {
        return menu.get();
    }

    public int getHarga() {
        return harga.get();
    }

    public SimpleStringProperty menuProperty() {
        return menu;
    }

    public SimpleIntegerProperty hargaProperty() {
        return harga;
    }
}
