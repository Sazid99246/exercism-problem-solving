/**
 * The {@code LuhnValidator} class provides a method to validate a string number
 * using the Luhn algorithm. The Luhn algorithm is a simple checksum formula
 * used to validate a variety of identification numbers, such as credit card
 * numbers, IMEI numbers, National Provider Identifier numbers in the US, and
 * Canadian Social Insurance Numbers.
 */
public class LuhnValidator {

    /**
     * Default constructor for LuhnValidator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public LuhnValidator() {

    }

    /**
     * Checks if the given string is a valid number according to the Luhn algorithm.
     *
     * This method first sanitizes the input string by removing all spaces. It then
     * checks if the resulting string is a valid number (contains only digits) and
     * has a length of at least 2 characters. The method implements the Luhn
     * algorithm to determine if the number is valid. The algorithm processes each
     * digit, doubling every second digit from right to left, and subtracting 9 from
     * any results that are greater than 9. Finally, it checks if the sum of all
     * processed digits is divisible by 10.
     *
     * @param candidate The string to be validated.
     * @return {@code true} if the provided string is a valid number according to
     *         the
     *         Luhn algorithm, {@code false} otherwise.
     */
    boolean isValid(String candidate) {
        String sanitized = candidate.replaceAll("\\s+", ""); // Remove spaces

        // Reject if sanitized string contains non-digits or is less than 2 digits
        if (!sanitized.matches("\\d+") || sanitized.length() < 2) {
            return false;
        }

        int sum = 0;
        boolean shouldDouble = sanitized.length() % 2 == 0;

        for (char digit : sanitized.toCharArray()) {
            int n = Character.getNumericValue(digit);

            if (shouldDouble) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }

            sum += n;
            shouldDouble = !shouldDouble;
        }

        return sum % 10 == 0;
    }
}
