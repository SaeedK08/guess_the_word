package sk.guess_the_word.model;

import java.util.Arrays;
import java.util.Random;

public class GuessWord {
    private char[] guessWord, guessSoFar;
    private final String[] wordList = {
            "cat", "dog", "sun", "car", "sky", "tree", "fish", "book", "door", "milk",
            "apple", "table", "chair", "light", "water", "plant", "green", "house", "bread", "sweet",
            "music", "river", "beach", "cloud", "stone", "grass", "money", "night", "smile", "dream",
            "clock", "heart", "sound", "round", "flame", "tiger", "zebra", "lemon", "grape", "pearl",
            "drink", "sleep", "happy", "clean", "sharp", "fresh", "quick", "train", "fruit", "sugar",
            "north", "south", "earth", "ocean", "field", "windy", "rainy", "sunny", "funny", "brave",
            "story", "movie", "photo", "color", "paper", "phone", "knife", "spoon", "plate", "glass",
            "quiet", "crazy", "angry", "proud", "tired", "lucky", "sweet", "happy", "peace", "magic",
            "winter", "summer", "spring", "autumn", "garden", "castle", "planet", "rocket", "butter", "window",
            "teacher", "student", "morning", "evening", "animal", "holiday", "kitchen", "library", "station", "village"};
    private final Random rand;

    public GuessWord() {
        rand = new Random();
        reset();
    }

    public void setGuess(char ch) {
        for (int i = 0; i < guessWord.length; i++) {
            if (guessWord[i] == ch) {
                guessSoFar[i] = ch;
            }
        }
    }

    public boolean isSolved() {
        return getGuessWord().equals(getGuessSoFar());
    }

    public String getGuessWord() {
        String str = "";
        for (char ch : guessWord) {str += ch;};
        return str;
    }
    public String getGuessSoFar() {
        String str = "";
        for (char ch : guessSoFar) {str += ch;};
        return str;
    }

    public void reset() {
        guessWord = wordList[rand.nextInt(wordList.length)].toUpperCase().toCharArray();
        guessSoFar = new char[guessWord.length];
        Arrays.fill(guessSoFar, '*');
    }
}