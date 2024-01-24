public class Word {
    private String targetWord;
    private StringBuilder currentGuess;

    public String randomWord() {
        String[] wordList = {"pomme", "banane", "orange", "kiwi", "mangue", "ananas", "raisin"};
        targetWord = wordList[(int)Math.floor(Math.random() * wordList.length)];
        currentGuess = new StringBuilder();
        currentGuess.append("_".repeat(wordList.length));
        return targetWord;
    }
    public String getGuess() {
        return currentGuess.toString();
    }
    public Boolean isGuess() {
        return targetWord.contentEquals(currentGuess);
    }

    public Boolean addLetter(char letter) {
        if(targetWord.contains(String.valueOf(letter))) {
            for (int i = 0; i < targetWord.length(); i++) {
                if(targetWord.charAt(i) == letter) {
                    currentGuess.setCharAt(i, letter);
                }
            }

            return true;
        }

        return false;
    }
}
