package errorHandling;

/**
 * The {@code CustomUncheckedException} class is a custom exception type used
 * for demonstrating
 * unchecked exception handling in Java. It extends from
 * {@code RuntimeException}, making it an unchecked exception.
 * Unlike checked exceptions, methods that throw this exception are not required
 * to declare it in their {@code throws} clause.
 */
public class CustomUncheckedException extends RuntimeException {

    /**
     * Constructs a new {@code CustomUncheckedException} with {@code null} as its
     * detail message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to {@link #initCause}.
     */
    CustomUncheckedException() {
        super();
    }

    /**
     * Constructs a new {@code CustomUncheckedException} with the specified detail
     * message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to {@link #initCause}.
     *
     * @param message The detail message. The detail message is saved for later
     *                retrieval by the {@link #getMessage()} method.
     */
    CustomUncheckedException(String message) {
        super(message);
    }

}
