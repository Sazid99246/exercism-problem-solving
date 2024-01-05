package triangle;

/**
 * TriangleException is used to signal an error condition when a set of
 * conditions
 * for creating a valid triangle are not met. It extends the standard Java
 * Exception class.
 * This exception is thrown by the Triangle class when the sides provided do not
 * conform to the constraints necessary to form a triangle, such as the triangle
 * inequality theorem.
 */
public class TriangleException extends Exception {

    /**
     * Constructs a TriangleException with no detail message.
     */
    public TriangleException() {
        super();
    }

    /**
     * Constructs a TriangleException with the specified detail message.
     *
     * @param message the detail message.
     */
    public TriangleException(String message) {
        super(message);
    }

    // Additional constructors or methods can be added here as needed.
}
