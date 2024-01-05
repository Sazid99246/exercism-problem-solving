/**
 * The DifferenceOfSquaresCalculator class calculates the difference between the
 * square of the sum and the sum of the squares of the first N natural numbers.
 */
public class DifferenceOfSquaresCalculator {


    /**
     * Default constructor for DifferenceOfSquaresCalculator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public DifferenceOfSquaresCalculator() {

    }

    /**
     * Computes the square of the sum of the first 'input' natural numbers.
     *
     * @param input the number up to which the sum is calculated
     * @return the square of the sum of the first 'input' natural numbers
     */
    public int computeSquareOfSumTo(int input) {
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        return (int) Math.pow(sum, 2);
    }

    /**
     * Computes the sum of the squares of the first 'input' natural numbers.
     *
     * @param input the number up to which the squares are summed
     * @return the sum of the squares of the first 'input' natural numbers
     */
    public int computeSumOfSquaresTo(int input) {
        int sumOfSquare = 0;

        for (int i = 1; i <= input; i++) {
            sumOfSquare += Math.pow(i, 2);
        }
        return sumOfSquare;
    }

    /**
     * Calculates the difference between the square of the sum and the sum of the
     * squares of the first 'input' natural numbers.
     *
     * @param input the number up to which the calculation is done
     * @return the difference between the square of the sum and the sum of the
     *         squares
     */
    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    /**
     * Main method for demonstration purposes.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        DifferenceOfSquaresCalculator calculator = new DifferenceOfSquaresCalculator();
        System.out.println("Difference of squares for 10: " + calculator.computeDifferenceOfSquares(10));
    }
}
