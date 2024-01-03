package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public Map<String, Integer> phrase(String input) {
        String lowerInput = input.toLowerCase();
        Matcher matcher = Pattern.compile("\\b\\w+'?\\w*\\b").matcher(lowerInput);
        
        Map<String, Integer> wordsCount = new HashMap<>();

        while (matcher.find()) {
            String word = matcher.group();
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }

        return wordsCount;
    }

}