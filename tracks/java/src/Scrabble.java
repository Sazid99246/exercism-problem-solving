/**
 * The Scrabble class calculates the Scrabble game score for a given word.
 * Each letter in the word has a point value, and the score is the sum of these
 * values.
 */
public class Scrabble {

    /**
     * The word for which the Scrabble score will be calculated.
     */
    private String word;

    /**
     * Constructs a Scrabble instance with a given word.
     *
     * @param word The word to calculate the Scrabble score for.
     */
    Scrabble(String word) {
        this.word = word;
    }

    /**
     * Calculates and returns the Scrabble score of the word.
     * The score is calculated based on standard Scrabble letter values.
     *
     * @return The Scrabble score of the word.
     */
    int getScore() {
        int score = 0;
        for (int i = 0; i < this.word.length(); i++) {
            char letter = Character.toUpperCase(this.word.charAt(i));
            switch (letter) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T':
                    score += 1;
                    break;
                case 'D':
                case 'G':
                    score += 2;
                    break;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J':
                case 'X':
                    score += 8;
                    break;
                case 'Q':
                case 'Z':
                    score += 10;
                    break;
                default:
                    score += 0;
                    break;
            }
        }
        return score;
    }
}
