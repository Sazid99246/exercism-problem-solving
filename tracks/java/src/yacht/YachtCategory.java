package yacht;

/**
 * Enum representing the different scoring categories in the Yacht game.
 * Each category corresponds to a different way of scoring a set of dice rolls.
 */
public enum YachtCategory {
    /**
     * Yacht category: All five dice showing the same number.
     */
    YACHT,

    /**
     * Ones category: Sum of dice with the number one.
     */
    ONES,

    /**
     * Twos category: Sum of dice with the number two.
     */
    TWOS,

    /**
     * Threes category: Sum of dice with the number three.
     */
    THREES,

    /**
     * Fours category: Sum of dice with the number four.
     */
    FOURS,

    /**
     * Fives category: Sum of dice with the number five.
     */
    FIVES,

    /**
     * Sixes category: Sum of dice with the number six.
     */
    SIXES,

    /**
     * Full House category: Three of one number and two of another.
     */
    FULL_HOUSE,

    /**
     * Four of a Kind category: At least four dice showing the same number.
     */
    FOUR_OF_A_KIND,

    /**
     * Little Straight category: Dice showing one through five in sequence.
     */
    LITTLE_STRAIGHT,

    /**
     * Big Straight category: Dice showing two through six in sequence.
     */
    BIG_STRAIGHT,

    /**
     * Choice category: Sum of all dice, regardless of the number.
     */
    CHOICE
}
