package wizardWorriors2;

/**
 * The GameMaster class is responsible for generating descriptions of various
 * game elements like characters,
 * destinations, and travel methods.
 */
public class GameMaster {

    /**
     * Default constructor for GameMaster.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public GameMaster() {

    }

    /**
     * Generates a description for a given character.
     *
     * @param character The character to be described.
     * @return A string describing the character's level, class, and hit points.
     */
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with "
                + character.getHitPoints() + " hit points.";
    }

    /**
     * Generates a description for a given destination.
     *
     * @param destination The destination to be described.
     * @return A string describing the destination's name and the number of
     *         inhabitants.
     */
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants()
                + " inhabitants.";
    }

    /**
     * Generates a description for a given travel method.
     *
     * @param travelMethod The travel method to be described.
     * @return A string describing the travel method.
     */
    public String describe(TravelMethod travelMethod) {
        String description = "";
        if (travelMethod == TravelMethod.WALKING) {
            description = "You're traveling to your destination by walking.";
        } else if (travelMethod == TravelMethod.HORSEBACK) {
            description = "You're traveling to your destination on horseback.";
        }
        return description;
    }

    /**
     * Generates a combined description for a character, destination, and travel
     * method.
     *
     * @param character    The character to be described.
     * @param destination  The destination to be described.
     * @param travelMethod The travel method to be described.
     * @return A string combining the descriptions of the character, travel method,
     *         and destination.
     */
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    /**
     * Generates a combined description for a character and destination, assuming
     * walking as the travel method.
     *
     * @param character   The character to be described.
     * @param destination The destination to be described.
     * @return A string combining the descriptions of the character and destination
     *         with walking as the travel method.
     */
    public String describe(Character character, Destination destination) {
        return describe(character) + " You're traveling to your destination by walking. " + describe(destination);
    }
}
