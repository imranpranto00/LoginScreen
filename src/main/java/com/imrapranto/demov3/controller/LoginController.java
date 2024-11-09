package com.imrapranto.demov3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    // Method to handle the login action
    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Simple validation logic (replace with actual login logic)
        if ("admin".equals(username) && "password".equals(password)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Login Success");
            alert.setHeaderText(null);
            alert.setContentText("Welcome, " + username);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid credentials!");
            alert.showAndWait();
        }
    }
}
