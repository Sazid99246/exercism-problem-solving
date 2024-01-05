package robotSimulator;

/**
 * The GridPosition class represents a position on a grid.
 * It holds the x and y coordinates of a point in a two-dimensional space.
 */
public class GridPosition {

    /**
     * The x-coordinate of the position.
     */
    final int x;

    /**
     * The y-coordinate of the position.
     */
    final int y;

    /**
     * Constructs a new GridPosition with specified x and y coordinates.
     *
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     */
    GridPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Generates a hash code for this GridPosition.
     * The hash code is calculated based on the x and y coordinates.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    /**
     * Compares this GridPosition with another object for equality.
     * The comparison is based on the x and y coordinates.
     *
     * @param obj The object to be compared with this GridPosition.
     * @return True if the given object represents the same grid position, false
     *         otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else if (x != ((GridPosition) obj).x || y != ((GridPosition) obj).y) {
            return false;
        } else {
            return true;
        }
    }
}
