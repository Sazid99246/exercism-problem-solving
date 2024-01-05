import java.math.BigInteger;

/**
 * The Grains class represents a problem involving a chessboard where the number
 * of grains of wheat
 * doubles on each square of the board, starting with one grain on the first
 * square.
 */
public class Grains {

    /**
     * Default constructor for Grains.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Grains() {

    }

    /**
     * Calculates the number of grains on a specific square of the chessboard.
     * The number of grains doubles on each square, starting with one grain on the
     * first square.
     *
     * @param square the square number on the chessboard (1 to 64)
     * @return the BigInteger representing the number of grains on the specified
     *         square
     * @throws IllegalArgumentException if the square number is not between 1 and 64
     */
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }

    /**
     * Calculates the total number of grains on the entire chessboard.
     * This is the sum of the grains on all 64 squares.
     *
     * @return the BigInteger representing the total number of grains on the
     *         chessboard
     */
    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

}
