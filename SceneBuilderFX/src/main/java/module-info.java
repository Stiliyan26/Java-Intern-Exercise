module com.example.scenebuilderfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilderfx to javafx.fxml;
    exports com.example.scenebuilderfx;
}