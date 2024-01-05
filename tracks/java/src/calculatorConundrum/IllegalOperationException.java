package calculatorConundrum;

/**
 * The IllegalOperationException class represents an exception that is thrown
 * when an illegal or unsupported operation is encountered in the
 * CalculatorConundrum class.
 * This class extends RuntimeException, allowing it to be used for unchecked
 * exceptions.
 */
public class IllegalOperationException extends RuntimeException {

    /**
     * Constructs an IllegalOperationException with the specified detail message.
     *
     * @param errorMessage The detail message for the exception.
     */
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    /**
     * Constructs an IllegalOperationException with the specified detail message and
     * cause.
     *
     * @param errorMessage The detail message for the exception.
     * @param cause        The cause of the exception, which allows for chaining
     *                     exceptions.
     */
    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
