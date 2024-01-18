import java.util.Stack;

/**
 * The BracketChecker class is designed to check whether the brackets in a given
 * string expression
 * are matched and nested correctly. This includes various types of brackets
 * such as parentheses,
 * square brackets, and curly braces.
 */
public class BracketChecker {

    // The string expression containing the brackets to be checked.
    private String expression;

    /**
     * Constructs a new BracketChecker with the specified string expression.
     *
     * @param expression The string containing brackets to be checked.
     */
    BracketChecker(String expression) {
        this.expression = expression;
    }

    /**
     * Checks if the brackets in the expression are matched and nested correctly.
     * The method uses a stack to track open brackets and checks if they are
     * properly
     * closed in the correct order. Supports parentheses '()', square brackets '[]',
     * and curly braces '{}'.
     *
     * @return true if the brackets are matched and nested correctly, false
     *         otherwise.
     */
    boolean areBracketsMatchedAndNestedCorrectly() {
        Stack<Character> stack = new Stack<>();
        String open = "{[(";
        String close = "}])";
        for (char ch : expression.toCharArray()) {
            int openIdx = open.indexOf(ch);
            int closeIdx = close.indexOf(ch);
            if (openIdx != -1)
                stack.add(ch);
            else if (closeIdx != -1)
                if (stack.isEmpty() || stack.peek() != open.charAt(closeIdx))
                    return false;
                else
                    stack.pop();
        }
        return stack.isEmpty();
    }

}
