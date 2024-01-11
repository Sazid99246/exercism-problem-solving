import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is used for calculating the largest product in a series of digits.
 * It takes a string of digits as input and allows the calculation of the
 * largest
 * product for a specified series length within the given number.
 */
public class LargestSeriesProductCalculator {

    /**
     * The string representation of the number in which the largest product of a
     * series of digits
     * will be calculated. It is expected to contain only numeric digits.
     */
    private String number;

    /**
     * Constructs a LargestSeriesProductCalculator with a given string of digits.
     * It validates the input to ensure that it contains only digits.
     *
     * @param inputNumber The string of digits to be analyzed.
     * @throws IllegalArgumentException if the input string contains non-digit
     *                                  characters.
     */
    LargestSeriesProductCalculator(String inputNumber) {
        for (char c : inputNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
        this.number = inputNumber;
    }

    /**
     * Calculates the largest product for a specified number of adjacent digits
     * (series length)
     * in the input string.
     * 
     * @param numberOfDigits The length of the series to be considered for
     *                       calculating the product.
     * @return The largest product of the specified number of adjacent digits.
     * @throws IllegalArgumentException if the series length is greater than the
     *                                  input string length
     *                                  or if the series length is less than 1.
     */
    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > number.length()) {
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 1) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        List<Long> products = new ArrayList<>();

        for (int i = 0; i <= number.length() - numberOfDigits; i++) {
            long product = 1;
            for (int j = i; j < i + numberOfDigits; j++) {
                int digit = number.charAt(j) - '0';
                if (digit < 0 || digit > 9) {
                    throw new IllegalArgumentException("Invalid character found in input number.");
                }
                product *= digit;
            }
            products.add(product);
        }

        return products.isEmpty() ? 0 : Collections.max(products);

    }

}
