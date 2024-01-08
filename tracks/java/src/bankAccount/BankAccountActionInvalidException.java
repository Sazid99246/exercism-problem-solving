package bankAccount;

/**
 * This class represents an exception that is thrown when an invalid action is
 * attempted on a BankAccount.
 * It extends the standard Exception class, adding specific context for bank
 * account operations.
 * Instances of this class are thrown by methods in the BankAccount class when
 * they encounter an operation
 * that is not valid for the current state or parameters of the account.
 */
public class BankAccountActionInvalidException extends Exception {

    /**
     * Constructs a new BankAccountActionInvalidException with the specified detail
     * message.
     * The message is saved for later retrieval by the
     * {@link Throwable#getMessage()} method.
     *
     * @param message the detail message which provides more information about the
     *                reason
     *                why this exception is thrown.
     */
    public BankAccountActionInvalidException(String message) {
        super(message);
    }
}
