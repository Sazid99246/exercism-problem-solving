/**
 * The PopCount class provides a method to count the number of 1s in the binary
 * representation
 * of an integer. This is also known as the population count or 'pop count'.
 */
public class PopCount {

    /**
     * Default constructor for PopCount.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public PopCount() {

    }

    /**
     * Counts the number of 1s in the binary representation of an integer.
     * This method converts the given integer to its binary string representation
     * and then counts the number of 1s in it.
     *
     * @param number the integer whose binary representation is to be evaluated.
     * @return the count of 1s in the binary representation of the given number.
     */
    public int populationCount(int number) {
        int count = 0;
        char[] binary = Integer.toBinaryString(number).toCharArray();

        for (char c : binary) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }
}
