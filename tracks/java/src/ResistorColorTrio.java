import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class is used to calculate the resistance value of a resistor based on
 * the color bands.
 * It supports standard resistor color codes and calculates values in ohms,
 * kiloohms, megaohms, and gigaohms.
 */
public class ResistorColorTrio {

    /**
     * A map of resistor colors to their corresponding numeric codes.
     */
    private Map<String, Integer> colorCodeMap;

    /**
     * Constructs a ResistorColorTrio instance and initializes the map with standard
     * resistor colors and their numeric values.
     * The colors supported are black, brown, red, orange, yellow, green, blue,
     * violet, grey, and white.
     */
    public ResistorColorTrio() {
        colorCodeMap = new LinkedHashMap<>();
        colorCodeMap.put("black", 0);
        colorCodeMap.put("brown", 1);
        colorCodeMap.put("red", 2);
        colorCodeMap.put("orange", 3);
        colorCodeMap.put("yellow", 4);
        colorCodeMap.put("green", 5);
        colorCodeMap.put("blue", 6);
        colorCodeMap.put("violet", 7);
        colorCodeMap.put("grey", 8);
        colorCodeMap.put("white", 9);
    }

    /**
     * Calculates the resistance value of a resistor based on its color bands.
     * The first two color bands are used to form the base resistance value,
     * while the third color band determines the multiplier (number of zeros to
     * add).
     * The method handles the conversion of the resistance value into appropriate
     * units
     * (ohms, kiloohms, megaohms, or gigaohms) based on its magnitude.
     *
     * @param colors An array of strings representing the color bands on the
     *               resistor.
     *               This array must contain exactly three elements, each
     *               corresponding
     *               to a valid color code (black, brown, red, orange, yellow,
     *               green, blue, violet, grey, white).
     * @return A string representing the resistance value with its appropriate unit.
     *         For example, "4700 ohms", "47 kiloohms", "4.7 megaohms", etc.
     * @throws IllegalArgumentException if the input array does not contain exactly
     *                                  three color codes,
     *                                  or if any of the provided colors are not
     *                                  valid resistor colors.
     */
    public String label(String[] colors) {
        if (colors.length < 3) {
            throw new IllegalArgumentException("Three color values are required.");
        }

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(colorCodeMap.get(colors[0]));
        resultBuilder.append(colorCodeMap.get(colors[1]));

        int multiplier = colorCodeMap.get(colors[2]);
        for (int i = 0; i < multiplier; i++) {
            resultBuilder.append("0");
        }

        long totalValue = Long.parseLong(resultBuilder.toString());
        String result;
        if (totalValue >= 1_000_000_000) {
            result = (totalValue / 1_000_000_000) + " gigaohms";
        } else if (totalValue >= 1_000_000) {
            result = (totalValue / 1_000_000) + " megaohms";
        } else if (totalValue >= 1000) {
            result = (totalValue / 1000) + " kiloohms";
        } else {
            result = totalValue + " ohms";
        }
        return result;
    }
}
