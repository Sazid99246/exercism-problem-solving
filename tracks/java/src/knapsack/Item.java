package knapsack;

/**
 * The Item class represents an item to be placed in a knapsack.
 * Each item has a specific weight and value.
 */
public class Item {

    // The weight of the item
    int weight;

    // The value of the item
    int value;

    /**
     * Constructs an Item with the specified weight and value.
     *
     * @param itemWeight The weight of the item.
     * @param itemValue  The value of the item.
     */
    Item(int itemWeight, int itemValue) {
        this.weight = itemWeight;
        this.value = itemValue;
    }
}
