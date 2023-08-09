module com.example.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcss to javafx.fxml;
    exports com.example.javafxcss;
}