package sk.guess_the_word.view;


import sk.guess_the_word.model.GuessWord;


public class Controller {
    private GuessWord guessWord;
    private View view;

    public Controller(View view) {
        guessWord = new GuessWord();
        this.view = view;
    }

    public String getGuessSoFar() {
        return guessWord.getGuessSoFar();
    }
    public void handleGuess() {
        if (view.getTextFieldContent() == "") return;
        char ch = view.getTextFieldContent().toUpperCase().charAt(0);
        guessWord.setGuess(ch);
        view.updateWord(getGuessSoFar());
        view.clearTextField();
        if (guessWord.isSolved()) { view.setAlert("Congratulation, you won!!"); }
    }
    public void handleNewGame() {
        guessWord.reset();
        view.updateWord(getGuessSoFar());
    }

}

