/**
 * The PangramChecker class provides a method to check if a given input string
 * is a pangram, which means it contains all 26 lowercase English letters at
 * least once.
 */
public class PangramChecker {

    /**
     * Checks if the input string is a pangram.
     *
     * @param input The input string to be checked.
     * @return True if the input is a pangram (contains all 26 lowercase English
     *         letters), false otherwise.
     */
    public boolean isPangram(String input) {
        // Convert the input to lowercase, remove non-alphabet characters,
        // count distinct characters, and check if the count is equal to 26.
        return input
                .toLowerCase()
                .replaceAll("[^a-z]", "")
                .chars()
                .distinct()
                .count() == 26;
    }

}
