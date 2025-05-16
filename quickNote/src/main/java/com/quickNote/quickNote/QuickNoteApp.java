package com.quickNote.quickNote;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import com.quickNote.quickNote.controller.QuickNoteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickNoteApp extends Application {

    public static void main(String[] args) {
        SpringApplication.run(QuickNoteApp.class, args);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        QuickNoteController controller = new QuickNoteController();
        Scene scene = new Scene(controller.createLayout(), 600, 400);

        primaryStage.setTitle("QuickNote");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
