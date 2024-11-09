package com.imrapranto.demov3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

@Component
public class MainViewController {
    @FXML
    private Label helloLabel;

    public void initialize() {
        helloLabel.setText("Welcome to JavaFX with Spring Boot!");
    }
}

