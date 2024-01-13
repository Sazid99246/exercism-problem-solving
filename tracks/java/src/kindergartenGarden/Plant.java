package kindergartenGarden;

/**
 * Enumeration for different types of plants in a kindergarten garden.
 * Each enum constant represents a different type of plant.
 */
public enum Plant {
    VIOLETS,
    RADISHES,
    CLOVER,
    GRASS;

    /**
     * Returns the plant corresponding to the given plant code.
     *
     * @param plantCode The character code representing a plant.
     *                  'G' for GRASS, 'C' for CLOVER, 'R' for RADISHES, and 'V' for
     *                  VIOLETS.
     * @return The {@link Plant} enum constant corresponding to the given code, or
     *         null if the code is not recognized.
     */
    static Plant getPlant(char plantCode) {
        switch (plantCode) {
            case 'G':
                return GRASS;
            case 'C':
                return CLOVER;
            case 'R':
                return RADISHES;
            case 'V':
                return VIOLETS;
            default:
                return null;
        }
    }
}
