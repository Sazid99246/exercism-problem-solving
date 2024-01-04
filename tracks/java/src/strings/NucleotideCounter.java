package strings;

import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

    private char[] charArr;
    private Map<Character, Integer> map = new HashMap<>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};

    NucleotideCounter(String sequence) {
        this.charArr = sequence.toCharArray();

        for (char ch : charArr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    Map<Character, Integer> nucleotideCounts() {
        return map;
    }

}