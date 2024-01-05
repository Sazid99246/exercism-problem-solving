/**
 * The MicroBlog class provides functionality for handling text content in a
 * microblogging context.
 * Specifically, it includes a method to truncate text content to a specific
 * length.
 */
public class MicroBlog {

    /**
     * Truncates a given string to a length that does not exceed the first 5 code
     * points.
     * If the input string is shorter than or equal to 5 code points, it is returned
     * unchanged.
     * 
     * @param input The string to be truncated.
     * @return The truncated string, limited to the first 5 code points.
     */
    public String truncate(String input) {
        return input.length() < 6 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}
