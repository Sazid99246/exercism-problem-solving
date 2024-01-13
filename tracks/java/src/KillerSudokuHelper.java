import java.util.ArrayList;
import java.util.List;

/**
 * This class provides helper methods to generate valid number combinations for
 * cages in a Killer Sudoku puzzle.
 */
public class KillerSudokuHelper {

    /**
     * Default constructor for KillerSudokuHelper.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public KillerSudokuHelper() {

    }

    /**
     * Generates all possible combinations of numbers that sum up to a specified
     * cage sum,
     * with a given cage size, excluding certain numbers.
     *
     * @param cageSum  the sum of numbers in the cage.
     * @param cageSize the number of cells in the cage.
     * @param exclude  a list of numbers to exclude from the combinations.
     * @return a list of lists, where each inner list represents a valid
     *         combination.
     */
    public List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        generateCombinations(cageSum, cageSize, 1, currentCombination, result, exclude);
        return result;
    }

    /**
     * Overloaded method to generate all possible combinations of numbers that sum
     * up to a specified cage sum,
     * with a given cage size. No numbers are excluded in this method.
     *
     * @param cageSum  the sum of numbers in the cage.
     * @param cageSize the number of cells in the cage.
     * @return a list of lists, where each inner list represents a valid
     *         combination.
     */
    public List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, new ArrayList<>());
    }

    /**
     * A private helper method to recursively generate combinations.
     *
     * @param targetSum          the target sum remaining to be achieved.
     * @param quantity           the number of numbers still needed to complete the
     *                           combination.
     * @param start              the starting number to consider for the current
     *                           combination.
     * @param currentCombination the current combination of numbers being formed.
     * @param result             the list of all valid combinations found so far.
     * @param exclude            the list of numbers to be excluded from the
     *                           combinations.
     */
    private static void generateCombinations(int targetSum, int quantity, int start, List<Integer> currentCombination,
            List<List<Integer>> result, List<Integer> exclude) {
        if (targetSum == 0 && quantity == 0) {
            // Found a valid combination
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > targetSum || quantity == 0)
                break;
            if (exclude.contains(i))
                continue;

            currentCombination.add(i);
            generateCombinations(targetSum - i, quantity - 1, i + 1,
                    currentCombination, result, exclude);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}