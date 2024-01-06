package wizardWorriors2;

/**
 * The Character class represents a character in the game with specific
 * attributes like class, level, and hit points.
 */
public class Character {

    /**
     * Default constructor for Character.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Character() {

    }

    /**
     * The class of the character (e.g., warrior, mage, etc.).
     */
    private String characterClass;

    /**
     * The level of the character.
     */
    private int level;

    /**
     * The hit points of the character, indicating health status.
     */
    private int hitPoints;

    /**
     * Retrieves the character's class.
     *
     * @return The class of the character.
     */
    public String getCharacterClass() {
        return characterClass;
    }

    /**
     * Sets the character's class.
     *
     * @param characterClass The class to be set for this character.
     */
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    /**
     * Retrieves the level of the character.
     *
     * @return The level of the character.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level of the character.
     *
     * @param level The level to be set for this character.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Retrieves the hit points of the character.
     *
     * @return The hit points of the character.
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Sets the hit points of the character.
     *
     * @param hitPoints The hit points to be set for this character.
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
