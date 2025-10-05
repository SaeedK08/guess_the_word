package sk.guess_the_word;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sk.guess_the_word.view.View;

public class Main extends Application {

    public void start(Stage stage) {
        View view = new View();
        Scene scene = new Scene(view, 380, 380);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Guess The Word");
        Image icon = new Image("word.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
