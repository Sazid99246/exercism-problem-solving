package perfectNumbers;

/**
 * The {@code NaturalNumber} class represents a natural number and provides
 * functionality to classify it as perfect, abundant, or deficient based on
 * its aliquot sum. A perfect number equals the sum of its proper divisors,
 * an abundant number is less than the sum of its proper divisors, and a
 * deficient number is more than the sum of its proper divisors.
 */
public class NaturalNumber {

    /**
     * The natural number to be classified.
     */
    private int number;

    /**
     * Constructs a new {@code NaturalNumber} with the specified value.
     *
     * @param number the natural number to be classified.
     */
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    /**
     * Calculates the aliquot sum of the natural number, which is the sum of all
     * proper divisors of the number (excluding the number itself).
     * This is a private method used internally to determine the classification
     * of the number.
     *
     * @return the aliquot sum of the number.
     */
    private int allequentSum() {
        int sum = 0;

        for (int i = 1; i < this.number; i++) {
            if (this.number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    /**
     * Determines the classification of the natural number based on its aliquot sum.
     * The number can be classified as PERFECT, ABUNDANT, or DEFICIENT.
     *
     * @return the {@code Classification} of the number.
     */
    Classification getClassification() {
        if (this.allequentSum() == this.number) {
            return Classification.PERFECT;
        } else if (this.allequentSum() > this.number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

    /**
     * Main method for demonstration purposes. Prints the classification of various
     * numbers.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(new NaturalNumber(6).getClassification());
        System.out.println(new NaturalNumber(28).getClassification());
        System.out.println(new NaturalNumber(12).getClassification());
        System.out.println(new NaturalNumber(24).getClassification());
        System.out.println(new NaturalNumber(8).getClassification());
    }
}
