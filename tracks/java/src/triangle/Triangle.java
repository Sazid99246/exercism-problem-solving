package triangle;

/**
 * The Triangle class represents a triangle defined by its three sides.
 * It provides methods to determine if the triangle is equilateral, isosceles,
 * or scalene.
 * The class also includes a constructor that validates the sides of the
 * triangle,
 * ensuring they adhere to the triangle inequality theorem.
 */
public class Triangle {
    /**
     * Length of the first side of the triangle.
     */
    private double side1;

    /**
     * Length of the second side of the triangle.
     */
    private double side2;

    /**
     * Length of the third side of the triangle.
     */
    private double side3;

    /**
     * Constructs a Triangle object with the specified side lengths.
     * Validates the sides to ensure they can form a valid triangle according to
     * the triangle inequality theorem.
     * 
     * @param side1 Length of the first side of the triangle.
     * @param side2 Length of the second side of the triangle.
     * @param side3 Length of the third side of the triangle.
     * @throws TriangleException if the sides do not form a valid triangle.
     */
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 < side3 || side2 + side3 < side1
                || side1 + side3 < side2) {
            throw new TriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Determines if the triangle is equilateral (all sides are equal).
     * 
     * @return true if the triangle is equilateral, false otherwise.
     */
    boolean isEquilateral() {
        return this.side1 == this.side2 && this.side2 == this.side3;
    }

    /**
     * Determines if the triangle is isosceles (two sides are equal).
     * 
     * @return true if the triangle is isosceles, false otherwise.
     */
    boolean isIsosceles() {
        return (this.side1 == this.side2) || (this.side2 == this.side3) || (this.side3 == this.side1);
    }

    /**
     * Determines if the triangle is scalene (no sides are equal).
     * 
     * @return true if the triangle is scalene, false otherwise.
     */
    boolean isScalene() {
        return this.side1 != this.side2 && this.side2 != this.side3 && this.side3 != this.side1;
    }
}
