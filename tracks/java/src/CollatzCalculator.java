/**
 * This class provides a method to compute the number of steps required
 * to reach 1 using the Collatz Conjecture algorithm.
 * <p>
 * The Collatz Conjecture, also known as the 3x+1 problem, is a conjecture in
 * mathematics
 * that concerns a sequence defined as follows: start with any positive integer
 * n.
 * Then each term is obtained from the previous term as follows: if the previous
 * term is even,
 * the next term is one half of the previous term. If the previous term is odd,
 * the next term is 3 times the previous term plus 1. The conjecture is that no
 * matter what value of n,
 * the sequence will always reach 1.
 */
public class CollatzCalculator {

    /**
     * Default constructor for CollatzCalculator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public CollatzCalculator() {

    }

    /**
     * Computes the number of steps required to reach 1 for a given positive integer
     * according to the Collatz Conjecture.
     * <p>
     * The method uses a loop to repeatedly modify the input value. If the current
     * value is even,
     * it is divided by 2; if it is odd, it is multiplied by 3 and then increased by
     * 1.
     * This process continues until the value reaches 1. The method counts and
     * returns
     * the number of steps taken in this process.
     * 
     * @param start the positive integer from which to start the sequence
     * @return the number of steps required to reach 1
     * @throws IllegalArgumentException if the input is less than or equal to 0
     */
    int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        long value = start; // Use long to prevent overflow
        int steps = 0;
        while (value != 1) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = 3 * value + 1;
            }
            steps++;
        }
        return steps;
    }
}
