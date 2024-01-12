import java.util.ArrayList;
import java.util.List;

/**
 * DiamondPrinter is a class that creates a list of strings, each representing a
 * row of a diamond pattern.
 * The diamond pattern is centered around a specified end letter, starting and
 * ending with 'A'.
 */
public class DiamondPrinter {

    /**
     * Generates a diamond pattern in the form of a list of strings, with the
     * specified end letter as the widest point.
     *
     * @param endLetter The letter at the widest point of the diamond. This letter
     *                  determines the size of the diamond.
     * @return A List of strings where each string represents a row of the diamond
     *         pattern.
     */
    public List<String> printToList(char endLetter) {
        List<String> diamond = new ArrayList<>();
        int size = endLetter - 'A' + 1;

        // Generate the top half of the diamond
        for (int i = 0; i < size; i++) {
            diamond.add(createRow(i, size));
        }

        // Generate the bottom half of the diamond
        for (int i = size - 2; i >= 0; i--) {
            diamond.add(createRow(i, size));
        }

        return diamond;
    }

    /**
     * Creates a single row of the diamond pattern.
     *
     * @param index The current row index, where 0 is the first row.
     * @param size  The size of the diamond, which determines the number of rows and
     *              the length of each row.
     * @return A string representing a single row of the diamond pattern.
     */
    private String createRow(int index, int size) {
        char letter = (char) ('A' + index);
        int outerSpace = size - index - 1;
        StringBuilder row = new StringBuilder();

        // Leading spaces
        for (int i = 0; i < outerSpace; i++) {
            row.append(' ');
        }

        // First letter
        row.append(letter);

        // Spaces between letters (if any)
        if (letter != 'A') {
            for (int i = 0; i < 2 * index - 1; i++) {
                row.append(' ');
            }
            row.append(letter);
        }

        // Trailing spaces
        for (int i = 0; i < outerSpace; i++) {
            row.append(' ');
        }

        return row.toString();
    }

}