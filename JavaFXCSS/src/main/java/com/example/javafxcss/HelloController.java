package com.example.javafxcss;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label label;

    public void initialize(){
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick(){
        FileChooser chooser = new FileChooser();
        //DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("ZIP", "*zip"),
                new FileChooser.ExtensionFilter("PDF", "*pdf")
        );
        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());

        if (file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }
}