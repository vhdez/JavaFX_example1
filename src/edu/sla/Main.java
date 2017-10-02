package edu.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    //@Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("Hello Students!  This is Mr. Hernandez.");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First UI App in Java");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
