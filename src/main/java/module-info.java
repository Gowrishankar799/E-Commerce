module com.example.ecommercetwo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.ecommercetwo to javafx.fxml;
    exports com.example.ecommercetwo;
}