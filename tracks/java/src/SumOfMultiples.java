import java.util.HashSet;
import java.util.Set;

/**
 * The SumOfMultiples class calculates the sum of all unique multiples of
 * specified numbers up to a given limit.
 */
public class SumOfMultiples {

    /**
     * The upper limit up to which multiples are considered.
     */
    private int level;

    /**
     * The set of numbers for which multiples are calculated.
     */
    private int[] set;

    /**
     * A set to store unique multiples of the numbers in the specified set up to the
     * specified level.
     */
    private Set<Integer> multiples = new HashSet<>();

    /**
     * Constructs a SumOfMultiples instance with a specified level and set of
     * numbers.
     * It calculates the multiples upon instantiation.
     *
     * @param number The upper limit for the multiples.
     * @param set    The set of numbers for which multiples are calculated.
     */
    SumOfMultiples(int number, int[] set) {
        this.level = number;
        this.set = set;
        getMultiples();
    }

    /**
     * Calculates the multiples of the numbers in the set up to the specified level.
     * Stores the unique multiples in a set.
     */
    private void getMultiples() {
        for (int divisor : set) {
            for (int i = 1; i < level; i++) {
                if (i * divisor < level) {
                    multiples.add(i * divisor);
                }
            }
        }
    }

    /**
     * Calculates the sum of all unique multiples stored in the set.
     *
     * @return The sum of all unique multiples.
     */
    int getSum() {
        int sum = 0;
        for (Integer multiple : multiples) {
            sum += multiple;
        }
        return sum;
    }

    /**
     * Main method for demonstration purposes.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] set = { 3, 5 };
        SumOfMultiples sumOfMultiples = new SumOfMultiples(20, set);
        System.out.println(sumOfMultiples.getSum());
    }
}
