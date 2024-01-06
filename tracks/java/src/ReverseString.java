/**
 * The ReverseString class provides a method to reverse a given string.
 */
public class ReverseString {

    /**
     * Default constructor for ReverseString.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public ReverseString() {

    }

    /**
     * Reverses the provided string.
     *
     * @param inputString The string to be reversed.
     * @return The reversed string.
     */
    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
}
