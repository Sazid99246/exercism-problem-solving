package yacht;

/**
 * The Yacht class represents a scoring system for the Yacht (similar to
 * Yahtzee) game.
 */
public class Yacht {
    /**
     * An array representing the values of the dice rolled.
     */
    private int[] dice;

    /**
     * The category under which the score is to be calculated.
     */
    private YachtCategory yachtCategory;

    /**
     * Constructs a Yacht instance with specified dice and category.
     *
     * @param dice          Array of dice values.
     * @param yachtCategory The category of the yacht score to be calculated.
     */
    public Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    /**
     * Calculates the score based on the yacht category.
     *
     * @return The calculated score.
     */
    public int score() {
        switch (yachtCategory) {
            case YACHT:
                return allSame() ? 50 : 0;
            case ONES:
            case TWOS:
            case THREES:
            case FOURS:
            case FIVES:
            case SIXES:
                return sumOfNumber(yachtCategory.ordinal());
            case FULL_HOUSE:
                return fullHouseScore();
            case FOUR_OF_A_KIND:
                return fourOfAKindScore();
            case LITTLE_STRAIGHT:
                return straightScore(1, 5);
            case BIG_STRAIGHT:
                return straightScore(2, 6);
            case CHOICE:
                return sumDice();
            default:
                return 0;
        }
    }

    /**
     * Checks if all dice have the same value.
     *
     * @return True if all dice are the same, false otherwise.
     */
    private boolean allSame() {
        for (int i = 1; i < dice.length; i++) {
            if (dice[0] != dice[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sums up the dice that match the given number.
     *
     * @param number The number to match and sum.
     * @return The sum of dice that match the given number.
     */
    private int sumOfNumber(int number) {
        int sum = 0;
        for (int die : dice) {
            if (die == number) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * Calculates the score for a full house.
     *
     * @return The score for a full house, or 0 if not a full house.
     */
    private int fullHouseScore() {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }

        boolean hasThree = false;
        boolean hasTwo = false;
        int score = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 3) {
                hasThree = true;
                score += (i + 1) * 3;
            } else if (counts[i] == 2) {
                hasTwo = true;
                score += (i + 1) * 2;
            }
        }

        return hasThree && hasTwo ? score : 0;
    }

    /**
     * Calculates the score for four of a kind.
     *
     * @return The score for four of a kind, or 0 if not four of a kind.
     */
    private int fourOfAKindScore() {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }

        return 0;
    }

    /**
     * Calculates the score for a straight.
     *
     * @param start The starting number of the straight.
     * @param end   The ending number of the straight.
     * @return The score for the straight, or 0 if not a straight.
     */
    private int straightScore(int start, int end) {
        boolean[] seen = new boolean[6];
        for (int die : dice) {
            seen[die - 1] = true;
        }

        for (int i = start - 1; i < end; i++) {
            if (!seen[i]) {
                return 0;
            }
        }

        return 30;
    }

    /**
     * Sums the values of all dice.
     *
     * @return The sum of all dice values.
     */
    private int sumDice() {
        int sum = 0;
        for (int die : dice) {
            sum += die;
        }
        return sum;
    }
}
