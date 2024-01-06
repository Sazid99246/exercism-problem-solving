package wizardWorriors2;

/**
 * The Destination class represents a location in the game with specific
 * attributes like name and number of inhabitants.
 */
public class Destination {
    /**
     * The name of the destination.
     */

    /**
     * Default constructor for Destination.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Destination() {

    }

    /**
     * Name of the destination
     */
    private String name;

    /**
     * The number of inhabitants at the destination.
     */
    private int inhabitants;

    /**
     * Retrieves the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the destination.
     *
     * @param name The name to be set for this destination.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the number of inhabitants of the destination.
     *
     * @return The number of inhabitants at the destination.
     */
    public int getInhabitants() {
        return inhabitants;
    }

    /**
     * Sets the number of inhabitants of the destination.
     *
     * @param inhabitants The number of inhabitants to be set for this destination.
     */
    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}
