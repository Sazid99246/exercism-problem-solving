/**
 * The {@code Matrix} class represents a two-dimensional matrix of integers.
 * It provides methods to retrieve specific rows and columns from the matrix.
 * The matrix is initialized from a string representation, where each row
 * is separated by a newline and each element within a row is separated by a
 * space.
 */
public class Matrix {

    /**
     * The two-dimensional array to store the matrix elements.
     */
    private int[][] matrix;

    /**
     * Constructs a {@code Matrix} object from a string representation.
     * Each row of the matrix is separated by a newline character ('\n'),
     * and each element within a row is separated by a space.
     *
     * @param matrixAsString The string representation of the matrix.
     * @throws NumberFormatException if any of the values cannot be parsed as an
     *                               integer.
     */
    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        matrix = new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            String[] values = rows[i].split(" ");
            matrix[i] = new int[values.length];
            for (int j = 0; j < values.length; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
    }

    /**
     * Retrieves a specific row from the matrix.
     * The row numbers start from 1.
     *
     * @param rowNumber The row number to retrieve (1-indexed).
     * @return An array of integers representing the specified row.
     * @throws ArrayIndexOutOfBoundsException if the row number is out of range.
     */
    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    /**
     * Retrieves a specific column from the matrix.
     * The column numbers start from 1.
     *
     * @param columnNumber The column number to retrieve (1-indexed).
     * @return An array of integers representing the specified column.
     * @throws ArrayIndexOutOfBoundsException if the column number is out of range.
     */
    int[] getColumn(int columnNumber) {
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}
