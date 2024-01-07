package allergies;

/**
 * The {@code Allergen} enum represents various common allergens, each with a
 * unique score.
 * The scores are used in bitwise operations to determine allergic reactions in
 * the {@code Allergies} class.
 */
public enum Allergen {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128);

    /**
     * The score associated with each allergen.
     */
    private final int score;

    /**
     * Constructs an allergen with a specified score.
     * 
     * @param score The unique score for this allergen.
     */
    Allergen(int score) {
        this.score = score;
    }

    /**
     * Retrieves the score of this allergen.
     * 
     * @return The score associated with the allergen.
     */
    int getScore() {
        return score;
    }
}
