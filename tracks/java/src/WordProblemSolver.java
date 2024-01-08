import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * The {@code WordProblemSolver} class is designed to solve simple arithmetic
 * word problems.
 * It supports basic operations like addition, subtraction, multiplication, and
 * division.
 * The class reads a string representing a word problem, processes it, and
 * returns the numeric solution.
 * Unsupported operations or formats will result in an
 * {@code IllegalArgumentException}.
 */
public class WordProblemSolver {

    /**
     * Default constructor for WordProblemSolver.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public WordProblemSolver() {

    }

    /**
     * A map of supported arithmetic operations represented in word form and their
     * corresponding
     * mathematical symbols.
     */
    private final static Map<String, String> supportedOperations = new HashMap<>() {
        {
            put("multiplied", "*");
            put("divided", "/");
            put("minus", "-");
            put("plus", "+");
        }
    };

    /**
     * Solves the given arithmetic word problem.
     *
     * @param wordProblem the arithmetic word problem in string format.
     * @return the result of the arithmetic operation as an integer.
     * @throws IllegalArgumentException if the word problem contains unsupported
     *                                  operations or
     *                                  is formatted incorrectly.
     */
    int solve(final String wordProblem) {
        String resultStr = wordProblem.replaceAll("[^a-zA-Z0-9\\s-]", "");
        String[] strArr = resultStr.split(" ");
        List<String> list = new ArrayList<>();

        for (String str : strArr) {
            if (str.equals("cubed"))
                throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
            if (supportedOperations.containsKey(str))
                list.add(supportedOperations.get(str));
            if (str.chars().anyMatch(ch -> Character.isDigit(ch)))
                list.add(str);
        }

        if (list.size() == 0)
            throw new IllegalArgumentException("I'm sorry, I don't understand the question!");

        int result = 0;
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            try {
                int x = Integer.parseInt(list.get(i));
                if (result == 0)
                    result += x;
                count++;

            } catch (NumberFormatException err) {

                count--;
                if (result == 0)
                    throw new IllegalArgumentException("I'm sorry, I don't understand the question!");

                try {
                    Integer.parseInt(list.get(i + 1));
                } catch (NumberFormatException err1) {
                    throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
                } catch (IndexOutOfBoundsException err2) {
                    throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
                }

                int y = Integer.parseInt(list.get(i + 1));

                switch (list.get(i)) {
                    case "*":
                        result *= y;
                        break;
                    case "-":
                        result -= y;
                        break;
                    case "+":
                        result += y;
                        break;
                    case "/":
                        result /= y;
                        break;
                }
            }
        }

        if (count > 1)
            throw new IllegalArgumentException("I'm sorry, I don't understand the question!");

        return result;
    }
}