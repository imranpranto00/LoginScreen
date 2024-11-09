package com.imrapranto.demov3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootApp {
    public static void main(String[] args) {
        // Launch the JavaFX application
        JavaFxApplication.launch(JavaFxApplication.class, args);
    }
}

