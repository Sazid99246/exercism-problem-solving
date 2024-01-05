/**
 * The RaindropConverter class is used to convert a number into a string that
 * mimics the sound of raindrops.
 * The conversion is based on the divisibility of the number by 3, 5, and 7.
 */
public class RaindropConverter {

    /**
     * A StringBuilder to build the resulting raindrop sounds string.
     */
    private StringBuilder rainSounds;

    /**
     * Constructs a RaindropConverter instance.
     */
    public RaindropConverter() {
        this.rainSounds = new StringBuilder();
    }

    /**
     * Converts a number into raindrop sounds.
     * <ul>
     * <li>If the number is divisible by 3, adds "Pling" to the result.</li>
     * <li>If the number is divisible by 5, adds "Plang" to the result.</li>
     * <li>If the number is divisible by 7, adds "Plong" to the result.</li>
     * <li>If the number is not divisible by 3, 5, or 7, returns the number as a string.</li>
     * </ul>
     *
     * @param number The number to be converted.
     * @return A string representing the raindrop sounds or the number itself.
     */
    public String convert(int number) {
        rainSounds.setLength(0); // Reset the StringBuilder for each new conversion

        if (number % 3 == 0) {
            rainSounds.append("Pling");
        }

        if (number % 5 == 0) {
            rainSounds.append("Plang");
        }

        if (number % 7 == 0) {
            rainSounds.append("Plong");
        }

        if (rainSounds.length() == 0) {
            rainSounds.append(number);
        }

        return rainSounds.toString();
    }

    /**
     * Main method for demonstration purposes.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        RaindropConverter raindropConverter = new RaindropConverter();
        System.out.println(raindropConverter.convert(45));
    }
}
