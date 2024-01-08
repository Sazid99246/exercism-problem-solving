/**
 * Provides the classes necessary to perform a binary search on an array of
 * integers.
 *
 * <p>
 * This package includes a BinarySearch class which implements the binary search
 * algorithm.
 * It is capable of searching for an integer value within a sorted array and
 * returning its index.
 * The implementation is designed to be efficient, leveraging the
 * divide-and-conquer approach
 * characteristic of binary search.
 * </p>
 *
 * <p>
 * The package also contains a custom exception class, ValueNotFoundException,
 * which is
 * thrown when the value being searched for is not present in the array. This
 * exception handling
 * ensures that the search operation can be managed effectively when dealing
 * with non-existent values.
 * </p>
 *
 * <p>
 * Usage of this package primarily involves creating an instance of the
 * BinarySearch class
 * with a sorted list of integers and then calling the indexOf method to find
 * the index of a
 * specific integer. Proper error handling for the ValueNotFoundException should
 * be implemented
 * when using the indexOf method.
 * </p>
 */
package binarySearch;
