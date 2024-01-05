import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The ResistorColor class provides functionality to map resistor color bands to
 * their corresponding numeric values.
 * It supports a set of standard resistor colors and can return either the
 * numeric code for a given color
 * or an array of all supported colors.
 */
public class ResistorColor {
    /**
     * A map of resistor colors to their corresponding numeric codes.
     */
    private Map<String, Integer> colorCodeMap;

    /**
     * Constructs a ResistorColor instance and initializes the map with standard
     * resistor colors and their codes.
     */
    public ResistorColor() {
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
     * Retrieves the numeric code corresponding to a given color.
     *
     * @param color The resistor color.
     * @return The numeric code associated with the color.
     * @throws NullPointerException if the color is not found in the map.
     */
    public int colorCode(String color) {
        return colorCodeMap.getOrDefault(color, -1);
    }

    /**
     * Returns an array of all supported resistor colors.
     *
     * @return An array of color names.
     */
    public String[] colors() {
        return colorCodeMap.keySet().toArray(new String[0]);
    }
}
