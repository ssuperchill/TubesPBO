package com.example.tugasbesarpbo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CafeApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CafeApp.fxml"));
        Parent root = loader.load();

        CafeController cafeController = loader.getController();
        cafeController.setPrimaryStage(primaryStage);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Cafe Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


