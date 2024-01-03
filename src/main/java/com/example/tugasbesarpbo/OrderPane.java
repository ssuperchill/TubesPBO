package com.example.tugasbesarpbo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class OrderPane {

    private CafeController controller;

    @FXML
    private TableView<Order> orderTable;

    @FXML
    private Button hapusButton;

    @FXML
    private Button prosesButton;

    @FXML
    private Label totalLabel;

    public void setController(CafeController controller) {
        this.controller = controller;
    }

    public void initialize() {
        TableColumn<Order, String> menuColumn = new TableColumn<>("Menu");
        menuColumn.setCellValueFactory(cellData -> cellData.getValue().menuProperty());

        TableColumn<Order, Integer> hargaColumn = new TableColumn<>("Harga");
        hargaColumn.setCellValueFactory(cellData -> cellData.getValue().hargaProperty().asObject());

        orderTable.getColumns().addAll(menuColumn, hargaColumn);

        hapusButton.setOnAction(e -> {
            Order selectedOrder = orderTable.getSelectionModel().getSelectedItem();
            if (selectedOrder != null) {
                controller.removeOrder(selectedOrder);
            } else {
                controller.showAlert("Pilih pesanan terlebih dahulu!");
            }
        });

        prosesButton.setOnAction(e -> {
            controller.processOrder();
        });
    }

    public void addOrder(String menu, int harga) {
        controller.addOrder(menu, harga);
    }

    public void removeOrder(Order order) {
        controller.removeOrder(order);
    }

    public void processOrder() {
        controller.processOrder();
    }

    public void updateTable(ObservableList<Order> orders) {
        orderTable.setItems(orders);
    }

    public void updateTotal(int total) {
        totalLabel.setText("Total Harga: " + total);
    }
}
