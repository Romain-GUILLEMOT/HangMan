public class HangmanStatus {
    private int attemptsLeft = 6;
    private static final String[] HANGMAN_STAGES = new String[]{
            // Étape 0: Pas d'erreur
            """
+---+
|   |
    |
    |
    |
    |
======
""",

            // Étape 1: Tête
            """
+---+
|   |
O   |
    |
    |
    |
======
""",

            // Étape 2: Corps
            """
+---+
|   |
O   |
|   |
    |
    |
======
""",

            // Étape 3: Bras gauche
            """
+---+
|   |
O   |
/|  |
    |
    |
======
""",

            // Étape 4: Bras droit
            """
+---+
|   |
O   |
/|\\ |
    |
    |
======
""",

            // Étape 5: Jambe gauche
            """
+---+
|   |
O   |
/|\\ |
/   |
    |
======
""",

            // Étape 6: Jambe droite
            """
+---+
|   |
O   |
/|\\ |
/ \\ |
    |
======
"""
    };

    public int decreaseAttemptsLeft() {
        attemptsLeft--;
        return attemptsLeft;
    }
    public void printStatus() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(HANGMAN_STAGES[6-attemptsLeft] + "\n\n Tentative restante : " + attemptsLeft);

    }

}
