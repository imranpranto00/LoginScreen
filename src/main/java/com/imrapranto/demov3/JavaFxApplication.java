package com.imrapranto.demov3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFxApplication extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() throws Exception {
        // Initialize Spring Application Context
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootApp.class);
        context = builder.run(getParameters().getRaw().toArray(new String[0]));
    }
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML and set the scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LoginScreen.fxml"));
        loader.setControllerFactory(context::getBean); // Use Spring's DI
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Login Screen");
        primaryStage.show();
        
    }

    @Override
    public void stop() throws Exception {
        // Close Spring Application Context
        context.close();
    }
}
