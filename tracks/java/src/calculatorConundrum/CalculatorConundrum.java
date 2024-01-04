package calculatorConundrum;

public class CalculatorConundrum  {
    public String calculate(int operand1, int operand2, String operation) throws ArithmeticException {
        switch(operation){
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

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}