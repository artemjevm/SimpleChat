module com.example.clientdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens com.example.clientdemo to javafx.fxml;
    exports com.example.clientdemo;

}