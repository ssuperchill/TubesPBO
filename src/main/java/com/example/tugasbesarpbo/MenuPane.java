package com.example.tugasbesarpbo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MenuPane {

    private CafeController controller;

    @FXML
    private ComboBox<String> menuComboBox;

    @FXML
    private Label hargaLabel;

    @FXML
    private Button tambahButton;

    public void setController(CafeController controller) {
        this.controller = controller;
    }

    public void initialize() {
        menuComboBox.getItems().addAll("Espresso", "Latte", "Cappuccino", "Croissant", "Cake");
        menuComboBox.setPromptText("Pilih Menu");

        menuComboBox.setOnAction(e -> {
            String selectedItem = menuComboBox.getValue();
            int harga = getMenuPrice(selectedItem);
            hargaLabel.setText("Harga: " + harga);
        });

        tambahButton.setOnAction(e -> {
            String selectedItem = menuComboBox.getValue();
            if (selectedItem != null && !selectedItem.isEmpty()) {
                controller.addOrder(selectedItem, getMenuPrice(selectedItem));
            } else {
                controller.showAlert("Pilih menu terlebih dahulu!");
            }
        });
    }

    private int getMenuPrice(String menu) {
        switch (menu) {
            case "Espresso":
                return 50000;
            case "Latte":
                return 60000;
            case "Cappuccino":
                return 65000;
            case "Croissant":
                return 30000;
            case "Cake":
                return 45000;
            default:
                return 0;
        }
    }
}

