import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hey bienvenue sur le pendu!\n\n");
        Word word = new Word();
        HangmanStatus hangmanStatus = new HangmanStatus();
        GuessedLetters guessedLetters = new GuessedLetters();
        Game game = new Game();
        word.randomWord();
        while (!word.isGuess()) {
            game.askLetter(hangmanStatus, guessedLetters, word);
        }

    }

}