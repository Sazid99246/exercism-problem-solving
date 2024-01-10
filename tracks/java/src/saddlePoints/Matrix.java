package saddlePoints;

import java.util.*;

/**
 * The Matrix class is used to identify saddle points in a given matrix.
 * A saddle point is an element of the matrix that is the minimum value in its
 * row and the maximum value in its column.
 */
public class Matrix {

    /**
     * A Set of MatrixCoordinate objects, each representing a saddle point in the matrix.
     * Saddle points are elements that are the minimum in their row and the maximum in their column.
     * This Set is populated during the construction of the Matrix object.
     */
    private Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    /**
     * Constructs a Matrix object and identifies saddle points.
     * Saddle points are identified and stored in a set during object construction.
     *
     * @param intLists A list of lists of Integers representing the matrix.
     */
    Matrix(List<List<Integer>> intLists) {
        for (int i = 0; i < intLists.size(); i++) {
            var row = intLists.get(i);
            List<Integer> maxIndexes = new ArrayList<>();
            var rowMax = Collections.max(row);
            for (int rowIndex = 0; rowIndex < row.size(); rowIndex++) {
                var rowValue = row.get(rowIndex);
                if (rowValue.equals(rowMax))
                    maxIndexes.add(rowIndex);
            }
            for (var rowIndex : maxIndexes) {
                List<Integer> column = new ArrayList<>();
                for (var rowX : intLists)
                    column.add(rowX.get(rowIndex));
                Integer colMin = Collections.min(column);
                if (row.get(rowIndex).equals(colMin))
                    saddlePoints.add(new MatrixCoordinate(i + 1, rowIndex + 1));
            }
        }
    }

    /**
     * Retrieves the set of saddle points identified in the matrix.
     * Each saddle point is represented as a MatrixCoordinate.
     *
     * @return A Set of MatrixCoordinate objects, each representing a saddle point
     *         in the matrix.
     */
    Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;
    }

}
