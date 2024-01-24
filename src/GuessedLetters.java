import java.util.ArrayList;
import java.util.List;

public class GuessedLetters {
    private final List<Character> guessedLetters;

    public GuessedLetters() {
        this.guessedLetters = new ArrayList<>();
    }
    public Boolean guessLetter(char letter) {
        if(guessedLetters.contains(letter)) {
            return false;
        }
        guessedLetters.add(letter);
        return true;
    }
}
