package bankAccount;

/**
 * The BankAccount class represents a simple bank account with basic banking
 * operations.
 * It allows the opening and closing of an account, as well as depositing,
 * withdrawing, and checking the balance.
 * The account must be open to perform any operations.
 */
public class BankAccount {

    /**
     * Determines if the account is open or not
     */
    private boolean isOpen;

    /**
     * Stores the amount of balance of an account
     */
    private int balance;

    /**
     * Constructs a new BankAccount instance.
     * Initially, the account is closed and has a balance of zero.
     */
    public BankAccount() {
        this.isOpen = false;
        this.balance = 0;
    }

    /**
     * Opens the bank account. If the account is already open, an exception is
     * thrown.
     *
     * @throws BankAccountActionInvalidException if the account is already open.
     */
    void open() throws BankAccountActionInvalidException {
        if (this.isOpen) {
            throw new BankAccountActionInvalidException("Account already open");
        }
        this.isOpen = true;
        this.balance = 0;
    }

    /**
     * Closes the bank account. If the account is already closed, an exception is
     * thrown.
     *
     * @throws BankAccountActionInvalidException if the account is not open.
     */
    void close() throws BankAccountActionInvalidException {
        if (!this.isOpen) {
            throw new BankAccountActionInvalidException("Account not open");
        }
        this.isOpen = false;
    }

    /**
     * Returns the current balance of the bank account.
     * The account must be open to check the balance.
     *
     * @return The current balance of the account.
     * @throws BankAccountActionInvalidException if the account is closed.
     */
    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (!this.isOpen) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return this.balance;
    }

    /**
     * Deposits the specified amount into the bank account.
     * The account must be open and the amount must be positive.
     *
     * @param amount The amount to deposit.
     * @throws BankAccountActionInvalidException if the account is closed or the
     *                                           amount is negative.
     */
    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        this.validateStatusAccount();
        this.validatePositiveAmount(amount);
        this.balance += amount;
    }

    /**
     * Withdraws the specified amount from the bank account.
     * The account must be open, the amount must be positive, and sufficient funds
     * must be available.
     *
     * @param amount The amount to withdraw.
     * @throws BankAccountActionInvalidException if the account is closed, the
     *                                           amount is negative, or insufficient
     *                                           funds.
     */
    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        this.validateStatusAccount();
        this.validatePositiveAmount(amount);
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        if (amount > this.balance) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        this.balance -= amount;
    }

    /**
     * Validates if the account is open.
     *
     * @throws BankAccountActionInvalidException if the account is closed.
     */
    private void validateStatusAccount() throws BankAccountActionInvalidException {
        if (!this.isOpen) {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }

    /**
     * Validates if the specified amount is positive.
     *
     * @param amount The amount to validate.
     * @throws BankAccountActionInvalidException if the amount is negative.
     */
    private void validatePositiveAmount(int amount) throws BankAccountActionInvalidException {
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
    }

}