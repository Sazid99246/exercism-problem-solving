import java.util.ArrayList;
import java.util.List;

/**
 * The {@code PrimeFactorsCalculator} class provides a method to calculate the
 * prime factors of a given number.
 */
public class PrimeFactorsCalculator {

    /**
     * Default constructor for PrimeFactorsCalculator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public PrimeFactorsCalculator() {

    }

    /**
     * Calculates and returns the list of prime factors of the specified number.
     * 
     * @param number the number to find the prime factors of.
     * @return a list of long integers representing the prime factors of the given
     *         number.
     *         If the number is less than 2, returns an empty list.
     */
    List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> listResult = new ArrayList<>();

        // Return empty list if number is less than 2
        if (number < 2L)
            return listResult;

        // Add number itself if it is 2 (which is a prime number)
        if (number == 2L) {
            listResult.add(number);
            return listResult;
        }

        // Start checking for factors from 2 onwards
        long i = 2L;
        while (number >= i) {
            if (number % i == 0) {
                listResult.add(i);
                number /= i;
            } else {
                i++;
            }
        }

        return listResult;
    }
}
