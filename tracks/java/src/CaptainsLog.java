import java.util.Random;

/**
 * The CaptainsLog class is used to generate random elements for a captain's log
 * in a space exploration context.
 * It can generate random planet classes, ship registry numbers, and stardates.
 */
public class CaptainsLog {

    /**
     * A list of planet classes
     */
    private static final char[] PLANET_CLASSES = new char[] { 'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y' };

    /**
     * variable to store the random class
     */
    private Random random;

    /**
     * Constructs a CaptainsLog with a specified source of randomness.
     *
     * @param random the Random instance used to generate random values.
     */
    CaptainsLog(Random random) {
        this.random = random;
    }

    /**
     * Generates a random planet class from the predefined set of classes.
     *
     * @return A randomly selected planet class character.
     */
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    /**
     * Generates a random ship registry number in the format "NCC-xxxx", where
     * 'xxxx' is a random number.
     *
     * @return A string representing a randomly generated ship registry number.
     */
    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }

    /**
     * Generates a random stardate. Stardates are fictional time measurements in
     * space exploration.
     * This method generates a stardate as a double value within a specific range.
     *
     * @return A double representing a randomly generated stardate.
     */
    double randomStardate() {
        return 41000.0 + 1000.0 * random.nextDouble();
    }
}
