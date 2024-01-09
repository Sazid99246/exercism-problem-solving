import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * This class represents a bookstore system for calculating the cost of a basket
 * of books.
 * It applies discounts based on the number of different titles bought.
 */
public class BookStore {

    /**
     * Default constructor for BookStore.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public BookStore() {

    }

    /**
     * Calculates the total cost of a basket of books with the maximum possible
     * discount.
     *
     * @param books A List of integers where each integer represents a book from a
     *              series.
     *              For example, '1' could be the first book, '2' the second, and so
     *              on.
     * @return The total cost of the books in the basket with the best possible
     *         discount.
     */
    double calculateBasketCost(List<Integer> books) {
        if (books.isEmpty()) {
            return 0.0;
        }

        // Count the frequency of each book in the basket
        int[] frequencies = new int[5];
        Arrays.fill(frequencies, 0);
        books.forEach(i -> frequencies[i - 1]++);

        // Sort the frequencies to group books based on their count
        Arrays.sort(frequencies);

        // Determine the number of each group size (1, 2, 3, 4, 5) for discounts
        Integer[] groups = IntStream.range(0, frequencies.length)
                .mapToObj(idx -> idx == 0 ? frequencies[idx] : frequencies[idx] - frequencies[idx - 1])
                .toArray(Integer[]::new);

        // Optimize discounts by replacing some 3-book and 5-book sets with 4-book sets
        int replaceCount = Math.min(groups[2], groups[0]);
        if (replaceCount > 0) {
            groups[2] -= replaceCount;
            groups[0] -= replaceCount;
            groups[1] += 2 * replaceCount;
        }

        // Calculate the total cost with applied discounts
        return 8.0 * (groups[4] // 5-book sets
                + 0.95 * 2 * groups[3] // 2-book sets
                + 0.9 * 3 * groups[2] // 3-book sets
                + 0.8 * 4 * groups[1] // 4-book sets
                + 0.75 * 5 * groups[0]); // 5-book sets
    }
}