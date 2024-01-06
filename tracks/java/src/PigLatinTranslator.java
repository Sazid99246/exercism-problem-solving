/**
 * This class provides a method to translate English words into Pig Latin.
 * Pig Latin is a constructed language game in which words in English are altered according to a set of rules.
 */
public class PigLatinTranslator {

    /**
     * Default constructor for PigLatinTranslator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public PigLatinTranslator() {

    }

    /**
     * Translates a given English word to Pig Latin.
     * The translation follows specific rules:
     * <ul>
     * <li>Rule 1: If a word begins with a vowel sound, "ay" is added to the end of the word.</li>
     * <li>Rule 2: If a word begins with a consonant sound, the consonant is moved to the end of the word, followed by "ay".</li>
     * <li>Rule 3: If a word starts with a consonant sound followed by "qu", both are moved to the end of the word, followed by "ay".</li>
     * <li>Rule 4: If a word contains a "y" after a consonant cluster or as the second letter in a two-letter word, it is treated as a vowel sound.</li>
     * </ul>
     * @param word the English word to be translated
     * @return the Pig Latin translation of the given word
     */

    public String translate(String word) {
        if (word.isEmpty()) {
            return word;
        }

        // Rule 1: Words starting with vowel sounds
        if (word.startsWith("xr") || word.startsWith("yt") || word.matches("^[aeiouAEIOU].*")) {
            return word + "ay";
        }

        // Rule 2 & 3: Words starting with consonant sounds or consonant sounds followed by "qu"
        if (word.matches("^[^aeiouAEIOU]+qu.*") || word.matches("^[^aeiouAEIOU]+.*")) {
            String consonantCluster = word.replaceAll("([aeiouyAEIOUY].*)", "");
            return word.substring(consonantCluster.length()) + consonantCluster + "ay";
        }

        // Rule 4: Handling 'y' after a consonant cluster or as the second letter in a two-letter word
        if (word.matches("^[^aeiouAEIOU]{2,}y.*") || (word.length() == 2 && word.startsWith("y"))) {
            return word.substring(1) + word.charAt(0) + "ay";
        }

        return word;
    }
}
