module sk.guess_the_word {
    requires javafx.controls;
    requires java.desktop;
    //requires javafx.fxml;


    opens sk.guess_the_word to javafx.fxml;
    exports sk.guess_the_word;
}