package com.failexe.GUI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.util.ArrayList;
/*
 Author: Samuel Glogger
 */
public class GUI extends Application{

    public void startGUI(String[] args){
        launch(args);
    }

    public void start(final Stage primaryStage){

        primaryStage.setTitle("QuizGame");
        primaryStage.show();
        VBox startMenu = new VBox();
        Button start = new Button("Start");
        Button quit = new Button("Quit");
        Button settings = new Button("Settings");
        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(start);
        buttons.add(settings);
        buttons.add(quit);
        for (Button button : buttons){
            button.setMinSize(50,30);
        }

        Scene scene = new Scene(startMenu,400,300);

        scene.setFill(Color.AQUA);
        startMenu.setSpacing(20);
        startMenu.setAlignment(Pos.CENTER);
        startMenu.getChildren().addAll(start,settings,quit);
        BorderPane QuizMenu = new BorderPane();
        Button firstAnswer, secondAnswer, thirdAnswer, fourthAnswer;
        firstAnswer = new Button();
        secondAnswer = new Button();
        thirdAnswer = new Button();
        fourthAnswer = new Button();
        Label QuestionLabel = new Label();
        HBox AnswerBox = new HBox();
        AnswerBox.setSpacing(15);
        VBox firstRow = new VBox();
        VBox secondRow = new VBox();
        firstRow.setSpacing(15);
        secondRow.setSpacing(15);
        firstRow.getChildren().add(firstAnswer);
        firstRow.getChildren().add(secondAnswer);
        secondRow.getChildren().add(thirdAnswer);
        secondRow.getChildren().add(fourthAnswer);
        AnswerBox.getChildren().add(firstRow);
        AnswerBox.getChildren().add(secondRow);
        QuizMenu.setCenter(QuestionLabel);
        QuizMenu.setBottom(AnswerBox);
        AnswerBox.setAlignment(Pos.CENTER);

        final Scene GameScene = new Scene(QuizMenu,500,300);

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(GameScene);
            }
        });
        quit.setOnAction(new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }
        });


        primaryStage.setScene(scene);


    }
}
