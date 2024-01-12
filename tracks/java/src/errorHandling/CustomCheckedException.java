package errorHandling;

/**
 * The {@code CustomCheckedException} class represents a custom exception type
 * used for demonstrating
 * checked exception handling in Java. It extends from {@code Exception} making
 * it a checked exception.
 * This means that methods which might throw this exception must declare it in
 * their {@code throws} clause.
 */
public class CustomCheckedException extends Exception {

    /**
     * Constructs a new {@code CustomCheckedException} with {@code null} as its
     * detailed message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to {@link #initCause}.
     */
    CustomCheckedException() {
        super();
    }

    /**
     * Constructs a new {@code CustomCheckedException} with the specified detail
     * message.
     * The cause is not initialized, and may subsequently be initialized by a call
     * to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for later
     *                retrieval by the {@link #getMessage()} method.
     */
    CustomCheckedException(String message) {
        super(message);
    }

}
