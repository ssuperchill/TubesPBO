package com.example.tugasbesarpbo;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class CafeController {

    @FXML
    private MenuPane menuPane;

    @FXML
    private OrderPane orderPane;

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void initialize() {
        menuPane.setController(this);
        orderPane.setController(this);
    }

    public void addOrder(String menu, int harga) {
        orderPane.addOrder(menu, harga);
    }

    public void removeOrder(Order order) {
        orderPane.removeOrder(order);
    }

    public void processOrder() {
        orderPane.processOrder();
    }

    public void showAlert(String message) {
    }
}

