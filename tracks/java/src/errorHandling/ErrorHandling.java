/**
 * This package provides various methods for handling errors in Java applications.
 */
package errorHandling;

import java.util.Optional;

/**
 * The {@code ErrorHandling} class contains methods to demonstrate different
 * ways of handling errors
 * in Java, including both checked and unchecked exceptions.
 */
public class ErrorHandling {

    /**
     * Throws an {@code IllegalArgumentException} without a message.
     * This method demonstrates the simplest form of throwing an unchecked
     * exception.
     */
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    /**
     * Throws an {@code IllegalArgumentException} with a detail message.
     * This method shows how to throw an unchecked exception with a custom message.
     *
     * @param message The detail message for the exception.
     */
    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    /**
     * Throws a custom checked exception without a message.
     * This method demonstrates how to throw a user-defined checked exception.
     *
     * @throws CustomCheckedException if an error occurs.
     */
    void handleErrorByThrowingAnyCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    /**
     * Throws a custom checked exception with a detail message.
     * This method shows how to throw a user-defined checked exception with a custom
     * message.
     *
     * @param message The detail message for the exception.
     * @throws CustomCheckedException if an error occurs.
     */
    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    /**
     * Throws an {@code ArithmeticException} without a message.
     * This method demonstrates throwing a common unchecked exception.
     */
    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArithmeticException();
    }

    /**
     * Throws an {@code ArithmeticException} with a detail message.
     * This method shows how to throw an unchecked exception with a custom message.
     *
     * @param message The detail message for the exception.
     */
    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new ArithmeticException(message);
    }

    /**
     * Throws a custom checked exception without a message.
     * This method demonstrates how to throw a user-defined checked exception.
     *
     * @throws CustomCheckedException if an error occurs.
     */
    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    /**
     * Throws a custom checked exception with a detail message.
     * This method shows how to throw a user-defined checked exception with a custom
     * message.
     *
     * @param message The detail message for the exception.
     * @throws CustomCheckedException if an error occurs.
     */
    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    /**
     * Throws a custom unchecked exception without a message.
     * This method demonstrates how to throw a user-defined unchecked exception.
     */
    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    /**
     * Throws a custom unchecked exception with a detail message.
     * This method shows how to throw a user-defined unchecked exception with a
     * custom message.
     *
     * @param message The detail message for the exception.
     */
    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    /**
     * Handles an error by returning an {@code Optional<Integer>}.
     * This method demonstrates how to use Optional to handle potential errors,
     * such as a number format exception.
     *
     * @param integer The string to be parsed as an integer.
     * @return An {@code Optional<Integer>} containing the parsed integer or empty
     *         if a parsing error occurs.
     */
    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

}
