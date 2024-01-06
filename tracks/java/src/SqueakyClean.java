/**
 * The SqueakyClean class provides functionality to clean a string identifier by
 * applying a set of specific rules.
 * It handles spaces, ISO control characters, hyphens, and certain Unicode
 * characters.
 */
public class SqueakyClean {

    /**
     * Default constructor for SqueakyClean.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public SqueakyClean() {

    }

    /**
     * Cleans the provided string identifier according to specific rules.
     * Spaces are replaced with underscores, ISO control characters are replaced
     * with "CTRL",
     * hyphens indicate that the next character (if it's a letter) should be in
     * uppercase, and
     * certain Unicode characters are removed.
     *
     * @param identifier The string to be cleaned.
     * @return A cleaned version of the string.
     */
    static String clean(String identifier) {
        StringBuilder newStr = new StringBuilder();
        boolean toUpper = false;
        for (int i = 0; i < identifier.length(); i++) {
            char character = identifier.charAt(i);
            if (Character.isSpaceChar(character)) {
                newStr.append('_');
            } else if (Character.isISOControl(character)) {
                newStr.append("CTRL");
            } else if (character == '-') {
                toUpper = true;
            } else if (!Character.isLetter(character)) {
                continue;
            } else if (character >= '\u03B1' && character <= '\u03C9') {
                continue;
            } else {
                if (toUpper) {
                    newStr.append(Character.toUpperCase(character));
                    toUpper = false;
                } else {
                    newStr.append(character);
                }
            }
        }
        return newStr.toString();
    }
}
