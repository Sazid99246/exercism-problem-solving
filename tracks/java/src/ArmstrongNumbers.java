/**
 * The {@code ArmstrongNumbers} class provides a method to determine whether a
 * given integer
 * is an Armstrong number or not. An Armstrong number (also known as a
 * narcissistic number,
 * pluperfect digit, or Plus Perfect number) is a number that is the sum of its
 * own digits
 * each raised to the power of the number of digits.
 */
public class ArmstrongNumbers {

    /**
     * Default constructor for ArmstrongNumbers.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public ArmstrongNumbers() {

    }

    /**
     * Determines if a given integer is an Armstrong number.
     * An Armstrong number is a number that is equal to the sum of its own digits
     * each raised to
     * the power of the number of digits. For example, 153 is an Armstrong number
     * since
     * 1^3 + 5^3 + 3^3 = 153.
     *
     * @param numberToCheck the integer number to be checked.
     * @return {@code true} if the given number is an Armstrong number,
     *         {@code false} otherwise.
     */
    boolean isArmstrongNumber(int numberToCheck) {

        char[] numArray = String.valueOf(numberToCheck).toCharArray();
        int len = numArray.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int digit = numArray[i] - '0';
            sum += Math.pow(digit, len);
        }

        return sum == numberToCheck;
    }

}
