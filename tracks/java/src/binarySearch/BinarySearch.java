package binarySearch;

import java.util.List;

/**
 * Implements a binary search on an array of integers.
 */
public class BinarySearch {

    /**
     * An array of integers representing the sorted list of song numbers.
     */
    private final int[] songs;

    /**
     * Constructs a BinarySearch object with the given list of integers.
     * 
     * @param items The list of integers to be searched.
     */
    BinarySearch(List<Integer> items) {
        // Convert the list of integers to an array of primitives.
        songs = items.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Finds the index of a specified item using binary search.
     * 
     * @param item The integer value to be searched.
     * @return The index of the item in the array.
     * @throws ValueNotFoundException If the item is not found in the array.
     */
    int indexOf(int item) throws ValueNotFoundException {
        int start = 0;
        int end = songs.length - 1;

        // Check if the array is empty.
        if (end < 0)
            throw new ValueNotFoundException("Value not in array");

        // While the search space is valid (start index is less than or equal to end
        // index).
        while (start <= end) {
            // Calculate the middle index.
            int mid = start + (end - start) / 2;

            // Check if the middle element is the target item.
            if (item == songs[mid]) {
                return mid;
            } else if (item < songs[mid]) { // If the item is less than the middle element, search the left half.
                end = mid - 1;
            } else { // If the item is greater than the middle element, search the right half.
                start = mid + 1;
            }
        }

        // If the item is not found, throw an exception.
        throw new ValueNotFoundException("Value not in array");
    }
}