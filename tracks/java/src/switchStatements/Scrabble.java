package switchStatements;

public class Scrabble {

    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < this.word.length(); i++) {

            switch (Character.toUpperCase(this.word.charAt(i))) {
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
                    continue;
                case 'D':
                case 'G':
                    score += 2;
                    continue;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    continue;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    continue;
                case 'K':
                    score += 5;
                    continue;
                case 'J':
                case 'X':
                    score += 8;
                    continue;
                case 'Q':
                case 'Z':
                    score += 10;
                    continue;
                default:
                    score += 0;
                    continue;
            }

        }
        return score;
    }
}
