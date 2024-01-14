package knapsack;

import java.util.List;

/**
 * The Knapsack class represents a solution to the classic Knapsack problem.
 * It provides a method to calculate the maximum value that can be accommodated
 * in a knapsack given a list of items with individual weights and values.
 */
public class Knapsack {

    /**
     * Constructor to create a new instance of Knapsack.
     */
    Knapsack() {

    }

    /**
     * Calculates the maximum value that can be accommodated in the knapsack.
     * 
     * This method implements the dynamic programming approach to solve the 0/1
     * Knapsack problem. It computes the maximum value that can be accommodated
     * in a knapsack of a specified maximum weight.
     * 
     * @param maxWeight The maximum weight that the knapsack can hold.
     * @param items     The list of items to be considered, each with a weight and a
     *                  value.
     * @return The maximum value that can be accommodated in the knapsack without
     *         exceeding the maximum weight.
     */
    int maximumValue(int maxWeight, List<Item> items) {
        int size = items.size();
        if (maxWeight == 0 || size == 0)
            return 0;
        int[][] w = new int[size + 1][maxWeight + 1];
        for (int j = 0; j < size; j++) {
            w[0][j] = 0;
        }
        for (int i = 1; i <= size; i++) {
            Item curItem = items.get(i - 1);
            for (int j = 0; j <= maxWeight; j++) {
                if (curItem.weight > j) {
                    w[i][j] = w[i - 1][j];
                } else
                    w[i][j] = Math.max(w[i - 1][j], curItem.value + w[i - 1][j - curItem.weight]);
            }
        }
        return w[size][maxWeight];
    }
}