package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResistorColorDuo {
    Map<String, Integer> colorCodeMap = new LinkedHashMap<>();

    ResistorColorDuo(){
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

    int value(String[] colors) {
        
        String color1 = String.valueOf(colorCodeMap.get(colors[0]));
        String color2 = String.valueOf(colorCodeMap.get(colors[1]));
        String result = color1 + color2;

        return Integer.valueOf(result);
    }

}
