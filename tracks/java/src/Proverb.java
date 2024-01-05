/**
 * The Proverb class generates a proverb based on a sequence of words.
 * The proverb is built by iterating through the words and applying a specific
 * format to create a narrative.
 */
public class Proverb {
    /**
     * An array of words used to generate the proverb.
     */
    private String[] words;

    /**
     * Constructs a Proverb instance with a given array of words.
     *
     * @param words The array of words used to generate the proverb.
     */
    Proverb(String[] words) {
        this.words = words;
    }

    /**
     * Generates and returns the proverb as a string.
     * The proverb is composed of lines formed by iterating over the words array.
     * Each line relates a consequence of the absence of an item to the absence of
     * the next item in the array.
     * The last line emphasizes the consequence of missing the first item.
     *
     * @return A string representing the generated proverb, or an empty string if
     *         the words array is empty.
     */
    String recite() {
        if (words.length == 0) {
            return "";
        }

        StringBuilder proverb = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            proverb.append(String.format("For want of a %s the %s was lost.%n", words[i], words[i + 1]));
        }

        proverb.append(String.format("And all for the want of a %s.", words[0]));

        return proverb.toString();
    }
}
