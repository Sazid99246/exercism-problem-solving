/**
 * The Lasagna class is used to calculate various times associated with the
 * preparation and cooking of lasagna.
 */
public class Lasagna {
    /**
     * Default constructor for Lasagna.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Lasagna() {

    }

    /**
     * Returns the standard expected oven time in minutes for cooking lasagna.
     *
     * @return the expected oven time in minutes
     */
    public int expectedMinutesInOven() {
        return 40;
    }

    /**
     * Calculates the remaining minutes in the oven based on the actual minutes
     * already spent in the oven.
     *
     * @param actualMinuteInOven the number of minutes the lasagna has already been
     *                           in the oven
     * @return the number of remaining minutes required in the oven
     */
    public int remainingMinutesInOven(int actualMinuteInOven) {
        return expectedMinutesInOven() - actualMinuteInOven;
    }

    /**
     * Calculates the preparation time in minutes based on the number of layers.
     * Assumes a fixed time to prepare each layer.
     *
     * @param layerCount the number of lasagna layers
     * @return the preparation time in minutes
     */
    public int preparationTimeInMinutes(int layerCount) {
        return layerCount * 2;
    }

    /**
     * Calculates the total time in minutes spent on preparing and cooking the
     * lasagna.
     *
     * @param layerCount         the number of lasagna layers
     * @param actualMinuteInOven the number of minutes the lasagna has already been
     *                           in the oven
     * @return the total time in minutes spent on the lasagna
     */
    public int totalTimeInMinutes(int layerCount, int actualMinuteInOven) {
        return preparationTimeInMinutes(layerCount) + actualMinuteInOven;
    }
}
