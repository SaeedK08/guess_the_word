package sk.guess_the_word.view;


import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class View extends GridPane {
    private Text text, word;
    private TextField tf;
    private Button guessButton, newGameButton;
    private Controller controller;
    Alert alert;

    public View() {
        controller = new Controller(this);
        initView();
        addEventHandlers();
    }

    public void addEventHandlers() {
        guessButton.setOnAction(event -> {
            controller.handleGuess();
        });
        tf.setOnAction(event -> {
            controller.handleGuess();
        });
        newGameButton.setOnAction(event -> {
            controller.handleNewGame();
        });
    }

    public void updateWord(String text) {
        word.setText(text);
    }

    public void clearTextField() {
        tf.clear();
    }

    public String getTextFieldContent() {
        return tf.getCharacters().toString();
    }

    public void setAlert(String str) {
        alert.setContentText(str);
        alert.showAndWait();
    }

    public void initView() {
        this.setVgap(20);
        this.setHgap(20);
        Image image = new Image("word.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        text = new Text("Enter a letter");
        text.setFont(Font.font("Noto Sans Myanmar", 17));
        System.out.println(Font.getFamilies());

        text.setFill(Color.GREEN);

        tf = new TextField();
        tf.setMaxWidth(50);
        guessButton = new Button("Guess");
        newGameButton = new Button("New Game");
        word = new Text(controller.getGuessSoFar());
        word.setFont(new Font("Vendera", 20));

        alert = new Alert(Alert.AlertType.INFORMATION);

        add(imageView, 0, 0);
        add(text, 0,1);
        add(tf, 1, 1);
        add(guessButton,2,1);
        add(word,1, 3);
        add(newGameButton,1,5);
        //this.setGridLinesVisible(true);

    }



}