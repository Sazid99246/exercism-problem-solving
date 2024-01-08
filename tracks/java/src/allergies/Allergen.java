package allergies;

/**
 * The {@code Allergen} enum represents various common allergens, each with a
 * unique score.
 * The scores are used in bitwise operations to determine allergic reactions in
 * the {@code Allergies} class.
 */
public enum Allergen {
    /**
     * Allergy score associated with eggs
     */
    EGGS(1),
    /**
     * Allergy score associated with peanuts
     */
    PEANUTS(2),
    /**
     * Allergy score associated with shellfish
     */
    SHELLFISH(4),
    /**
     * Allergy score associated with strawberry
     */
    STRAWBERRIES(8),
    /**
     * Allergy score associated with tomato
     */
    TOMATOES(16),
    /**
     * Allergy score associated with chocolate
     */
    CHOCOLATE(32),
    /**
     * Allergy score associated with pollen
     */
    POLLEN(64),
    /**
     * Allergy score associated with cat
     */
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
