import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * A tool that simulates the basic functionality of the grep command in Unix. It
 * searches for lines in files that match a given pattern.
 */
public class GrepTool {
    /**
     * Inverts the program and collect all lines that will fail to match
     */
    private static final String INVERT_MATCH_FLAG = "-v";
    /**
     * Matches using a case-insensitive comparison
     */
    private static final String CASE_INSENSITIVE_FLAG = "-i";
    /**
     * Search only for lines where the search string matches the entire line.
     */
    private static final String MATCH_ENTIRE_LINE_FLAG = "-x";
    /**
     * Prepends the line number and a colon (':') to each line in the output,
     * placing the number after the filename (if present).
     */
    private static final String ADD_LINE_NUM_FLAG = "-n";

    /**
     * Searches for lines in the specified files that match the given pattern.
     *
     * @param pattern The pattern to search for.
     * @param flags   The flags that modify the search behavior.
     * @param files   A list of file paths to search in.
     * @return A string containing the lines that match the pattern, potentially
     *         with additional information based on the provided flags.
     */
    String grep(String pattern, List<String> flags, List<String> files) {
        boolean prependFileName = files.size() > 1;
        return files
                .stream()
                .map(file -> matchPattern(pattern, flags, file, prependFileName))
                .flatMap(Collection::stream)
                .collect(Collectors.joining("\n"));
    }

    /**
     * Matches the pattern against the lines of a file.
     *
     * @param pattern         The pattern to match.
     * @param flags           The flags that modify the matching behavior.
     * @param file            The file to search in.
     * @param prependFileName A boolean indicating whether to prepend the file name
     *                        to the matched lines.
     * @return A list of strings representing the lines (or file names) that match
     *         the pattern.
     * @throws RuntimeException If there is an IO error while reading the file.
     */
    private List<String> matchPattern(String pattern, List<String> flags, String file, boolean prependFileName) {
        try {
            var lines = Files.readAllLines(Paths.get(file));

            return IntStream.range(0, lines.size())
                    .filter(idx -> filterLineByFlag(pattern, flags, idx, lines))
                    .mapToObj(idx -> mapToLineAndPrepend(flags, file, prependFileName, idx, lines.get(idx)))
                    .distinct()
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Filters lines based on the pattern and flags provided.
     *
     * @param pattern The pattern to match.
     * @param flags   The flags that modify the filtering behavior.
     * @param idx     The index of the line in the file.
     * @param lines   The lines of the file.
     * @return A boolean indicating whether the line matches the pattern and flags.
     */
    private boolean filterLineByFlag(String pattern, List<String> flags, int idx, List<String> lines) {
        var line = lines.get(idx);

        if (flags.contains(INVERT_MATCH_FLAG))
            return !line.contains(pattern);
        else if (flags.contains(MATCH_ENTIRE_LINE_FLAG)) {
            if (flags.contains(CASE_INSENSITIVE_FLAG))
                return line.equalsIgnoreCase(pattern);
            else
                return line.equals(pattern);
        } else if (flags.contains(CASE_INSENSITIVE_FLAG))
            return line.toLowerCase().contains(pattern.toLowerCase());
        else
            return line.contains(pattern);
    }

    /**
     * Prepares a line for output by potentially prepending file name and/or line
     * number, based on the flags.
     *
     * @param flags           The flags that modify the output behavior.
     * @param file            The file name to potentially prepend.
     * @param prependFileName A boolean indicating whether to prepend the file name.
     * @param lineNumber      The line number in the file.
     * @param line            The line from the file.
     * @return The formatted line as a string.
     */
    private String mapToLineAndPrepend(List<String> flags, String file, boolean prependFileName, int lineNumber,
            String line) {
        var sb = new StringBuilder();
        if (prependFileName)
            sb.append(file).append(":");
        if (flags.contains(ADD_LINE_NUM_FLAG))
            sb.append(lineNumber + 1).append(":");

        return sb.isEmpty() ? line : sb.append(line).toString();
    }
}
