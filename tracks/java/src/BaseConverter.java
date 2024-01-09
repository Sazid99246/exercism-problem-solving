import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class for converting numbers between different bases.
 */
public class BaseConverter {

    /**
     * The base of the original number. This is the base in which the number was
     * initially represented.
     */
    private int originalBase;

    /**
     * The digits of the original number, represented as an array of integers.
     * Each element in the array is a single digit of the number in the original
     * base.
     */
    private int[] originalDigits;

    /**
     * Constructs a BaseConverter with a specific base and its digits.
     *
     * @param originalBase   The base of the number to be converted. Must be at
     *                       least 2.
     * @param originalDigits An array of integers representing the digits of the
     *                       number in the original base.
     *                       Each digit must be non-negative and less than the
     *                       original base.
     * @throws IllegalArgumentException If the base is less than 2, or if any digit
     *                                  is negative or not less than the base.
     */
    BaseConverter(int originalBase, int[] originalDigits) {
        if (originalBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        } else if (Arrays.stream(originalDigits).anyMatch(e -> e < 0)) {
            throw new IllegalArgumentException("Digits may not be negative.");
        } else if (Arrays.stream(originalDigits).anyMatch(e -> e >= originalBase)) {
            throw new IllegalArgumentException("All digits must be strictly less than the base.");
        }
        this.originalBase = originalBase;
        this.originalDigits = originalDigits;
    }

    /**
     * Converts the number to a different base.
     *
     * @param newBase The base to convert the number to. Must be at least 2.
     * @return A list of integers representing the digits of the number in the new
     *         base.
     * @throws IllegalArgumentException If the new base is less than 2.
     */
    List<Integer> convertToBase(int newBase) {
        if (newBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        List<Integer> result = new ArrayList<>();
        int numberInBaseTen = 0;
        // Convert the original number to base 10
        for (int i = 0; i < originalDigits.length; i++) {
            numberInBaseTen += (int) (originalDigits[i] * Math.pow(originalBase, originalDigits.length - 1 - i));
        }
        // Convert from base 10 to the new base
        while (numberInBaseTen / newBase > 0) {
            result.add(0, numberInBaseTen % newBase);
            numberInBaseTen /= newBase;
        }
        result.add(0, numberInBaseTen % newBase);
        return result;
    }
}
