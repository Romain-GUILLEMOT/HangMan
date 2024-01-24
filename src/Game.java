import java.util.Scanner;

public class Game {
    public void askLetter(HangmanStatus hangmanStatus, GuessedLetters guessedLetters, Word word) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer une lettre :");
        char letter = scanner.next().charAt(0);
        if(guessedLetters.guessLetter(letter)) {
            Boolean found = word.addLetter(letter);
            if(found) {

                hangmanStatus.printStatus();
                System.out.println("\n" + word.getGuess());
                System.out.println("\nLettre Trouver !");
                if (word.isGuess()) {
                    System.out.println("Vous avez gagné !");
                    System.exit(0);
                }

            } else {
                hangmanStatus.decreaseAttemptsLeft();
                hangmanStatus.printStatus();
                System.out.println("\n" + word.getGuess());
                System.out.println("\nLettre Incorrect !");
            }
            return;
        }
        System.out.println("Lettre déja utiliser !");
        askLetter(hangmanStatus, guessedLetters, word);

    }
}
