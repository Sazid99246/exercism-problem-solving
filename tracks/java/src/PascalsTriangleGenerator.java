/**
 * The {@code PascalsTriangleGenerator} class is used to generate Pascal's
 * Triangle up to a specified level.
 * Pascal's Triangle is a triangular array of the binomial coefficients. This
 * class provides a method to
 * create the triangle as a two-dimensional array of integers.
 */
public class PascalsTriangleGenerator {

    /**
     * Generates Pascal's Triangle up to the specified level.
     * 
     * @param level The level up to which Pascal's Triangle should be generated.
     *              This must be a non-negative integer.
     *              The topmost level (single 1) is considered as level 0.
     * @return A two-dimensional integer array representing Pascal's Triangle up to
     *         the specified level.
     *         Each sub-array contains the elements of one level of the triangle.
     * @throws IllegalArgumentException If the input level is negative.
     */
    public int[][] generateTriangle(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("Level must be non-negative.");
        }

        int[][] retVal = new int[level][];
        for (int i = 0; i < level; i++) {
            retVal[i] = new int[i + 1];
            retVal[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                retVal[i][j] = retVal[i - 1][j - 1] + (j <= i - 1 ? retVal[i - 1][j] : 0);
            }
        }

        return retVal;
    }
}
