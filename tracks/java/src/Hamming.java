/**
 * The Hamming class calculates the Hamming distance between two DNA strands.
 * The Hamming distance is only defined for sequences of equal length and
 * measures
 * the number of differences between two strings.
 */
public class Hamming {
    /**
     * The first DNA strand for Hamming distance calculation.
     */
    private String leftStrand;

    /**
     * The second DNA strand for Hamming distance calculation.
     */
    private String rightStrand;

    /**
     * Constructs a Hamming object with two DNA strands.
     * The strands must be of equal length.
     *
     * @param leftStrand  The first DNA strand
     * @param rightStrand The second DNA strand
     * @throws IllegalArgumentException if the strands are not of equal length
     */
    public Hamming(String leftStrand, String rightStrand) {

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    /**
     * Calculates the Hamming distance between the two DNA strands.
     * This method counts the number of differences between the two strands.
     *
     * @return the Hamming distance as an integer
     */
    public int getHammingDistance() {

        int count = 0;

        for (int i = 0; i < this.leftStrand.length() && i < this.rightStrand.length(); i++) {
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
