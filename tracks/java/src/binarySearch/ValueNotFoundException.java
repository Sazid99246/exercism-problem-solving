package binarySearch;

/**
 * An exception that is thrown when a value is not found in a binary search
 * operation.
 */
public class ValueNotFoundException extends Exception {

    /**
     * Constructs a ValueNotFoundException with the specified detail message.
     *
     * @param message The detail message. The detail message is saved for
     *                later retrieval by the {@link Throwable#getMessage()} method.
     */
    ValueNotFoundException(String message) {
        super(message);
    }
}
