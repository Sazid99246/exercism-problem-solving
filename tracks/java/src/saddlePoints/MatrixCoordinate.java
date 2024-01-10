package saddlePoints;

/**
 * The MatrixCoordinate class represents a specific coordinate in a matrix.
 * It is used to identify the location of saddle points within the matrix.
 * This class implements the Comparable interface to facilitate sorting and
 * comparison of coordinates.
 */
public class MatrixCoordinate implements Comparable<MatrixCoordinate> {
    /**
     * The row index of the matrix coordinate.
     */
    private final int row;

    /**
     * The column index of the matrix coordinate.
     */
    private final int col;

    /**
     * Constructs a new MatrixCoordinate with specified row and column.
     *
     * @param row The row index of the coordinate.
     * @param col The column index of the coordinate.
     */
    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Provides a String representation of the MatrixCoordinate.
     *
     * @return A String in the format "Row: [row], Column: [col]".
     */
    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    /**
     * Compares this MatrixCoordinate with another for equality.
     * Two MatrixCoordinates are equal if they have the same row and column values.
     *
     * @param o The object to be compared for equality with this MatrixCoordinate.
     * @return true if the specified object is equal to this MatrixCoordinate.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MatrixCoordinate that = (MatrixCoordinate) o;

        return row == that.row && col == that.col;
    }

    /**
     * Returns a hash code value for the MatrixCoordinate.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    /**
     * Compares this MatrixCoordinate with another MatrixCoordinate.
     * The comparison is first based on the row, and then on the column.
     *
     * @param o The MatrixCoordinate to be compared.
     * @return A negative integer, zero, or a positive integer as this
     *         MatrixCoordinate
     *         is less than, equal to, or greater than the specified
     *         MatrixCoordinate.
     */
    @Override
    public int compareTo(MatrixCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}
