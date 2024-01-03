module com.example.tugasbesarpbo {
        requires javafx.controls;
        requires javafx.fxml;

        opens com.example.tugasbesarpbo to javafx.graphics;

        exports com.example.tugasbesarpbo;
}
