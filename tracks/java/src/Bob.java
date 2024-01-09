/**
 * The {@code Bob} class represents a conversational partner that responds
 * differently based on the nature of the input it receives.
 */
public class Bob {

    /**
     * Checks if a given string is considered shouting.
     * A string is considered shouting if it contains at least one letter
     * and all letters are in uppercase.
     *
     * @param input The string to check.
     * @return {@code true} if the input string is shouting; {@code false}
     *         otherwise.
     */
    boolean isShouting(String input) {
        return input.chars().anyMatch(Character::isLetter) &&
                input.chars().noneMatch(Character::isLowerCase);
    }

    /**
     * Responds to an input string based on its characteristics.
     * The response is determined by whether the input is shouting, a question,
     * silence (empty or whitespace only), or any other form of statement.
     *
     * @param input The string input to respond to.
     * @return A response based on the input's characteristics.
     */
    String hey(String input) {
        input = input.trim(); // Trim the input to remove leading and trailing spaces
        boolean shouting = isShouting(input);
        boolean question = input.endsWith("?");

        if (shouting && question) {
            return "Calm down, I know what I'm doing!";
        } else if (shouting) {
            return "Whoa, chill out!";
        } else if (question) {
            return "Sure.";
        } else if (input.isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }

}
