import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The ResistorColorDuo class provides functionality to calculate the resistance
 * value of a resistor
 * based on the first two color bands according to the resistor color code.
 */
public class ResistorColorDuo {
    /**
     * A map of resistor colors to their corresponding numeric codes.
     */
    private Map<String, Integer> colorCodeMap;

    /**
     * Constructs a ResistorColorDuo instance and initializes the map with standard
     * resistor colors and their codes.
     */
    public ResistorColorDuo() {
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
     * Calculates the resistance value represented by the first two color bands of a
     * resistor.
     *
     * @param colors An array of string representing the first two colors of the
     *               resistor.
     * @return The resistance value as an integer.
     * @throws NullPointerException           if any color is not found in the map.
     * @throws ArrayIndexOutOfBoundsException if less than two colors are provided.
     */
    public int value(String[] colors) {
        if (colors.length < 2) {
            throw new IllegalArgumentException("Two color values are required.");
        }

        String color1 = String.valueOf(colorCodeMap.get(colors[0]));
        String color2 = String.valueOf(colorCodeMap.get(colors[1]));
        String result = color1 + color2;

        return Integer.parseInt(result);
    }
}
