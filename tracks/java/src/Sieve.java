import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * The Sieve class implements the Sieve of Eratosthenes algorithm
 * for finding all prime numbers up to a specified integer.
 */
public class Sieve {
    private int maxPrime;

    /**
     * Constructs a Sieve object for finding prime numbers up to the specified
     * maximum.
     *
     * @param maxPrime The maximum number up to which to find prime numbers.
     */
    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    /**
     * Computes and returns a list of all prime numbers up to the maximum specified.
     * 
     * @return A List of integers, where each integer is a prime number.
     */
    List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            primes.add(i);
        }

        Iterator<Integer> iterator = primes.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (!isPrime(number)) {
                iterator.remove();
            }
        }
        return primes;
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

    /**
     * The main method for running the Sieve algorithm.
     * It constructs a Sieve object and prints all prime numbers up to 1000.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        Sieve sieve = new Sieve(1000);
        List<Integer> primes = sieve.getPrimes();
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }
}
