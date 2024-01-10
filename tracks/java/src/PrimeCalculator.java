/**
 * A class to calculate prime numbers.
 * This class provides a method to find the nth prime number using a basic trial
 * division method.
 */
public class PrimeCalculator {

    /**
     * Finds the nth prime number.
     * 
     * @param nth The ordinal position of the prime number to find.
     *            Must be a positive integer.
     * @return The nth prime number.
     * @throws IllegalArgumentException If the input is less than 1.
     */
    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException("Input must be greater than 0.");
        }

        int count = 0; // Number of primes found
        int number = 1; // Number to check for primality

        while (count < nth) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        return number;
    }

    /**
     * Checks if a number is prime.
     * 
     * @param number The number to check for primality.
     * @return {@code true} if the number is prime, {@code false} otherwise.
     */
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
