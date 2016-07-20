package com.failexe.GUI;

import com.failexe.Questions.Answer;
import com.failexe.Questions.Question;
import com.failexe.Questions.Questions;
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
import java.util.Random;

/*
 Author: Samuel Glogger
 */
public class GUI extends Application{

    static Questions questions = new Questions();

    public void startGUI(String[] args){
        launch(args);
    }

    Stage window;
    Button firstAnswer;
    Button secondAnswer;
    Button thirdAnswer;
    Button fourthAnswer;
    Label QuestionLabel = new Label();
    int level;
    Answer trueAnswer;
    Scene WinnerScene;
    Scene LoserScene;




    public void start(Stage primaryStage){

        if(questions == null){
            System.out.println("error");
        }
        window = primaryStage;
        window.setTitle("QuizGame");
        window.show();
        VBox startMenu = new VBox();
        Button start = new Button("Start");
        Button quit = new Button("Quit");
        Button settings = new Button("Settings");
        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(start);
        buttons.add(settings);
        buttons.add(quit);
        for (Button button : buttons){
            button.setPrefSize(50,30);
        }

        Scene scene = new Scene(startMenu,400,300);

        scene.setFill(Color.AQUA);
        startMenu.setSpacing(20);
        startMenu.setAlignment(Pos.CENTER);
        startMenu.getChildren().addAll(start,settings,quit);
        BorderPane QuizMenu = new BorderPane();
        firstAnswer = new Button();
        secondAnswer = new Button();
        thirdAnswer = new Button();
        fourthAnswer = new Button();
        firstAnswer.setPrefSize(150,50);
        secondAnswer.setPrefSize(150,50);
        thirdAnswer.setPrefSize(150,50);
        fourthAnswer.setPrefSize(150,50);
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

        Label win = new Label("!!!YOU WON!!!");
        win.setAlignment(Pos.CENTER);
        win.setPrefSize(200,200);
        Label lose = new Label("You losed...");
        lose.setPrefSize(200,200);
        lose.setAlignment(Pos.CENTER);
        WinnerScene = new Scene(win,400,300);
        LoserScene = new Scene(lose,400,300);

        final Scene GameScene = new Scene(QuizMenu,500,300);

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                level = 0;
                trueAnswer = update();
                window.setScene(GameScene);
            }
        });
        quit.setOnAction(new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {
                closeGame();
            }
        });
        firstAnswer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(trueAnswer.getAnswer() == firstAnswer.getText()){
                    if(level == 9){
                        window.setScene(WinnerScene);
                    }else{
                        level++;
                        trueAnswer = update();
                        window.setScene(GameScene);
                    }

                }else{
                    window.setScene(LoserScene);
                }
            }
        });
        secondAnswer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(trueAnswer.getAnswer() == secondAnswer.getText()){
                    if(level == 9){
                        window.setScene(WinnerScene);
                    }else{
                        level++;
                        trueAnswer = update();
                        window.setScene(GameScene);
                    }

                }else{
                    window.setScene(LoserScene);
                }
            }
        });
        thirdAnswer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(trueAnswer.getAnswer() == thirdAnswer.getText()){
                    if(level == 9){
                        window.setScene(WinnerScene);
                    }else{
                        level++;
                        trueAnswer = update();
                        window.setScene(GameScene);
                    }

                }else{
                    window.setScene(LoserScene);
                }
            }
        });
        fourthAnswer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(trueAnswer.getAnswer() == fourthAnswer.getText()){
                    if(level == 9){
                        window.setScene(WinnerScene);
                    }else{
                        level++;
                        trueAnswer = update();
                        window.setScene(GameScene);
                    }

                }else{
                    window.setScene(LoserScene);
                }
            }
        });



        primaryStage.setScene(scene);


    }
    public void closeGame(){
        if(ConfirmBox.display("Exit","Are you sure you want to exit?")){
            window.close();
        }
    }
    public Answer update(){

        Random random = new Random();
        Question question = questions.getQuestion(level);
        QuestionLabel.setText(question.getQuestion());
        switch (random.nextInt(4)){
            case 0:
                firstAnswer.setText(question.getTrueAnswer().getAnswer());
                secondAnswer.setText(question.getFalseAnswer1().getAnswer());
                thirdAnswer.setText(question.getFalseAnswer2().getAnswer());
                fourthAnswer.setText(question.getFalseAnswer3().getAnswer());
                break;
            case 1:
                secondAnswer.setText(question.getTrueAnswer().getAnswer());
                thirdAnswer.setText(question.getFalseAnswer1().getAnswer());
                fourthAnswer.setText(question.getFalseAnswer2().getAnswer());
                firstAnswer.setText(question.getFalseAnswer3().getAnswer());
                break;
            case 2:
                thirdAnswer.setText(question.getTrueAnswer().getAnswer());
                fourthAnswer.setText(question.getFalseAnswer1().getAnswer());
                firstAnswer.setText(question.getFalseAnswer2().getAnswer());
                secondAnswer.setText(question.getFalseAnswer3().getAnswer());
                break;
            case 3:
                fourthAnswer.setText(question.getTrueAnswer().getAnswer());
                firstAnswer.setText(question.getFalseAnswer1().getAnswer());
                secondAnswer.setText(question.getFalseAnswer2().getAnswer());
                thirdAnswer.setText(question.getFalseAnswer3().getAnswer());
                break;

        }
        return question.getTrueAnswer();
    }
}
