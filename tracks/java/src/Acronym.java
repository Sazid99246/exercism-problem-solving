/**
 * The {@code Acronym} class is used to generate acronyms from phrases.
 * It supports phrases with spaces, hyphens, and underscores as word separators.
 */
public class Acronym {

    /**
     * Default constructor for Acronym.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Acronym() {

    }

    /**
     * The phrase from which the acronym will be created.
     */
    private String phrase;

    /**
     * Constructs an {@code Acronym} object with the specified phrase.
     *
     * @param phrase The phrase to be converted into an acronym.
     */
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    /**
     * Generates an acronym from the provided phrase.
     * The acronym is formed by taking the first letter of each word in the phrase.
     * Words are considered to be separated by spaces, hyphens, or underscores.
     * Only the first alphanumeric character of each word is used in the acronym.
     * 
     * @return A string representing the acronym, in uppercase.
     */
    String get() {
        String result = "";
        // Split the phrase into words at spaces, hyphens, and underscores
        String[] words = phrase.split("[\\s-_]+");

        for (String word : words) {
            // Find the first alphanumeric character in each word
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    result += c;
                    break; // Break after adding the first alphanumeric character
                }
            }
        }
        return result.toUpperCase();
    }
}
