import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
/*
 Author: Samuel Glogger
 */
public class GUI extends Application{

    public void startGUI(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage){

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


        primaryStage.setScene(scene);


    }
}
