import java.util.LinkedHashMap;
import java.util.Map;

public class ResistorColorTrio {

    /**
     * A map of resistor colors to their corresponding numeric codes.
     */
    private Map<String, Integer> colorCodeMap;

    /**
     * Constructs a ResistorColorDuo instance and initializes the map with standard
     * resistor colors and their codes.
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

    String label(String[] colors) {
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
