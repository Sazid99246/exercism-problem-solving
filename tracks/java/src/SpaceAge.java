/**
 * Represents a calculation utility to determine age on different planets based
 * on orbital periods.
 * The age is calculated based on the input in seconds.
 */
public class SpaceAge {

    /**
     * Age in seconds.
     */
    private double seconds;

    /**
     * Constructor to initialize the SpaceAge object with an age in seconds.
     *
     * @param seconds Age in seconds.
     */
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    /**
     * Gets the age in seconds.
     *
     * @return Age in seconds.
     */
    double getSeconds() {
        return seconds;
    }

    /**
     * Calculates age on Earth.
     *
     * @return Age on Earth, formatted to two decimal places.
     */
    double onEarth() {
        return formatDecimal(seconds / 31557600);
    }

    /**
     * Calculates age on Mercury.
     *
     * @return Age on Mercury, formatted to two decimal places.
     */
    double onMercury() {
        return formatDecimal(seconds / (0.2408467 * 31557600));
    }

    /**
     * Calculates age on Venus.
     *
     * @return Age on Venus, formatted to two decimal places.
     */
    double onVenus() {
        return formatDecimal(seconds / (0.61519726 * 31557600));
    }

    /**
     * Calculates age on Mars.
     *
     * @return Age on Mars, formatted to two decimal places.
     */
    double onMars() {
        return formatDecimal(seconds / (1.8808158 * 31557600));
    }

    /**
     * Calculates age on Jupiter.
     *
     * @return Age on Jupiter, formatted to two decimal places.
     */
    double onJupiter() {
        return formatDecimal(seconds / (11.862615 * 31557600));
    }

    /**
     * Calculates age on Saturn.
     *
     * @return Age on Saturn, formatted to two decimal places.
     */
    double onSaturn() {
        return formatDecimal(seconds / (29.447498 * 31557600));
    }

    /**
     * Calculates age on Uranus.
     *
     * @return Age on Uranus, formatted to two decimal places.
     */
    double onUranus() {
        return formatDecimal(seconds / (84.016846 * 31557600));
    }

    /**
     * Calculates age on Neptune.
     *
     * @return Age on Neptune, formatted to two decimal places.
     */
    double onNeptune() {
        return formatDecimal(seconds / (164.79132 * 31557600));
    }

    /**
     * Formats a double value to two decimal places.
     *
     * @param value The value to be formatted.
     * @return The formatted value.
     */
    private double formatDecimal(double value) {
        return Double.parseDouble(String.format("%.2f", value));
    }
}
