import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The WordCount class provides a method to count the frequency of each word in
 * a given phrase.
 */
public class WordCount {

    /**
     * Counts the frequency of each word in the input phrase.
     * Words are recognized as sequences of one or more characters (letters or
     * apostrophes) bounded by word boundaries.
     * The method is case-insensitive.
     *
     * @param input The phrase whose words will be counted.
     * @return A map where each key is a word and its value is the count of that
     *         word in the phrase.
     */
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
