module com.example.modul {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul to javafx.fxml;
    exports com.example.modul;
}