import java.util.*;

public class ForthEvaluator {
    private Stack<Integer> stack = new Stack<>();
    private Map<String, String> definedWords = new HashMap<>();
    private Iterator<String> inputIterator;

    public List<Integer> evaluateProgram(List<String> input) {
        List<String> tokens = new ArrayList<>();
        for (String line : input) {
            tokens.addAll(Arrays.asList(line.split("\\s+")));
        }
        inputIterator = tokens.iterator();

        while (inputIterator.hasNext()) {
            execute(inputIterator.next().toLowerCase()); // Convert token to lowercase for case insensitivity
        }
        return new ArrayList<>(stack);
    }

    private void execute(String token) {
        if (definedWords.containsKey(token)) { // Check if it's a user-defined word first
            String[] subTokens = definedWords.get(token).split("\\s+");
            for (String subToken : subTokens) {
                execute(subToken.toLowerCase()); // Convert subToken to lowercase
            }
        } else {
            switch (token) {
                case "+":
                    arithmeticOperation((a, b) -> b + a, "Addition");
                    break;
                case "-":
                    arithmeticOperation((a, b) -> b - a, "Subtraction");
                    break;
                case "*":
                    arithmeticOperation((a, b) -> b * a, "Multiplication");
                    break;
                case "/":
                    arithmeticOperation((a, b) -> {
                        if (a == 0)
                            throw new IllegalArgumentException("Division by 0 is not allowed");
                        return b / a;
                    }, "Division");
                    break;
                case "dup":
                    if (stack.isEmpty())
                        throw new IllegalArgumentException(
                                "Duplicating requires that the stack contain at least 1 value");
                    stack.push(stack.peek());
                    break;
                case "drop":
                    if (stack.isEmpty())
                        throw new IllegalArgumentException("Dropping requires that the stack contain at least 1 value");
                    stack.pop();
                    break;
                case "swap":
                    if (stack.size() < 2)
                        throw new IllegalArgumentException(
                                "Swapping requires that the stack contain at least 2 values");
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a);
                    stack.push(b);
                    break;
                case "over":
                    if (stack.size() < 2)
                        throw new IllegalArgumentException("Overing requires that the stack contain at least 2 values");
                    int secondTop = stack.get(stack.size() - 2);
                    stack.push(secondTop);
                    break;
                default:
                    handleNumbersAndWords(token);
                    break;
            }
        }
    }

    private void arithmeticOperation(BinaryOperator<Integer> operation, String operationName) {
        if (stack.size() < 2) {
            throw new IllegalArgumentException(operationName + " requires that the stack contain at least 2 values");
        }
        int a = stack.pop();
        int b = stack.pop();
        stack.push(operation.apply(a, b));
    }

    private void handleNumbersAndWords(String token) {
        if (token.matches("-?\\d+")) { // Check if the token is a number
            stack.push(Integer.parseInt(token));
        } else if (definedWords.containsKey(token)) { // Check if it's a user-defined word
            String[] subTokens = definedWords.get(token).split("\\s+");
            for (String subToken : subTokens) {
                execute(subToken);
            }
        } else if (token.equals(":")) { // Start of a word definition
            defineNewWord();
        } else {
            throw new IllegalArgumentException("No definition available for operator \"" + token + "\"");
        }
    }

    private void defineNewWord() {
        if (!inputIterator.hasNext()) {
            throw new IllegalArgumentException("Incomplete definition for new word");
        }

        String newWordName = inputIterator.next().toLowerCase();
        if (newWordName.matches("-?\\d+")) { // Check if the name is a number
            throw new IllegalArgumentException("Cannot redefine numbers");
        }

        StringBuilder definition = new StringBuilder();
        while (inputIterator.hasNext()) {
            String defPart = inputIterator.next();
            if (defPart.equals(";")) {
                break; // End of definition
            }
            definition.append(defPart).append(" ");
        }

        if (definition.length() == 0) {
            throw new IllegalArgumentException("Incomplete definition for new word");
        }

        // Resolve the definition
        StringBuilder resolvedDefinition = new StringBuilder();
        for (String defPart : definition.toString().trim().split("\\s+")) {
            if (definedWords.containsKey(defPart.toLowerCase())) {
                // If part of the definition is a user-defined word, resolve it now
                resolvedDefinition.append(definedWords.get(defPart.toLowerCase())).append(" ");
            } else {
                resolvedDefinition.append(defPart).append(" ");
            }
        }

        definedWords.put(newWordName, resolvedDefinition.toString().trim());
    }

    @FunctionalInterface
    private interface BinaryOperator<T> {
        T apply(T a, T b);
    }
}