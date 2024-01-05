package calculatorConundrum;

/**
 * The CalculatorConundrum class provides basic arithmetic calculations.
 * It supports addition, subtraction, multiplication, and division operations.
 */

public class CalculatorConundrum {

    /**
     * Default constructor for CalculatorConundrum.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public CalculatorConundrum() {

    }

    /**
     * Performs an arithmetic calculation based on two operands and an operation.
     *
     * @param operand1  The first operand in the calculation.
     * @param operand2  The second operand in the calculation.
     * @param operation The arithmetic operation to perform. Supported operations
     *                  are "+", "-", "*", and "/".
     * @return A string representing the result of the arithmetic operation.
     * @throws ArithmeticException       if a division by zero is attempted.
     * @throws IllegalArgumentException  if the operation is null or empty.
     * @throws IllegalOperationException if the operation is not one of the
     *                                   supported operations.
     */
    public String calculate(int operand1, int operand2, String operation) throws ArithmeticException {
        switch (operation) {
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            case "+":
                return String.format("%s + %s = %s", operand1, operand2, (operand1 + operand2));
            case "-":
                return String.format("%s - %s = %s", operand1, operand2, (operand1 - operand2));
            case "*":
                return String.format("%s * %s = %s", operand1, operand2, (operand1 * operand2));
            case "/":
                try {
                    return String.format("%s / %s = %s", operand1, operand2, (operand1 / operand2));
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            default:
                throw new IllegalOperationException("Operation \'" + operation + "\' does not exist");
        }
    }
}