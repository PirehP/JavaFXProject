package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        grid.add(sceneTitle,0,0,2,1);

        Label userName = new Label("Username");
        grid.add(userName,0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);

        Label password = new Label("Password");
        grid.add(password,0,2);

        TextField passwordField = new TextField();
        grid.add(passwordField,1,2);

        Button btnAction = new Button("Sign In");
        grid.add(btnAction,1,5);

        final Text actionTarget = new Text();
        grid.add(actionTarget,1,6);

        btnAction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign-in button pressed");
            }
        });

        Scene scene = new Scene(grid, 300,275);
        scene.getStylesheets().add(this.getClass().getResource("Login.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}