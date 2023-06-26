module com.example.clientdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.clientdemo to javafx.fxml;
    exports com.example.clientdemo;

}