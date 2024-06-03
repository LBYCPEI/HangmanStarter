import acm.program.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman extends ConsoleProgram {

    // dimensions of window
    private static final int APPLICATION_WIDTH = 1080;
    private static final int APPLICATION_HEIGHT = 640;




    public void run() {
        // TODO: write this method
        // Example:
        displayHangman(0);
    }

    // TODO: comment this method
    private void intro() {
        // TODO: write this method
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method
        return 0;
    }


    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        // TODO: write this method
        return "";
    }

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        // TODO: write this method
        return '?';
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        File file = new File("assets/display" + guessCount + ".txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            int line_counter = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                println(line);
                canvas.printText(line);
//                canvas.printDisplay(data, line_counter);
                line_counter++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {
        // TODO: write this method
    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        // TODO: write this method
        return "";
    }

    public void init() {
        canvas = new HangmanCanvas();
        setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        add(canvas);
        canvas.reset();  // sample canvas method call
        println("Hello LBYCPEI!");
        println("This is the next line!");
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
