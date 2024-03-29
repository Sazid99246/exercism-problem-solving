/**
 * Markdown Parser
 *
 * This class provides functionality to parse a given markdown string and
 * convert it into its corresponding HTML representation. The parser
 * handles basic markdown features like headers, paragraphs, list items,
 * bold and italic text. The goal of this refactoring is to enhance
 * readability and maintainability while ensuring that the existing
 * functionality remains intact.
 */

public class Markdown {

    /**
     * Default constructor for Markdown.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Markdown() {

    }

    /**
     * Parses the given markdown string and returns the corresponding HTML.
     * 
     * @param markdown The markdown string to parse.
     * @return The HTML representation of the markdown.
     */
    public String parse(String markdown) {
        String[] lines = markdown.split("\n");
        StringBuilder result = new StringBuilder();
        boolean activeList = false;

        for (String line : lines) {
            String html = parseLine(line);

            // Manage lists
            if (isListItem(html)) {
                if (!activeList) {
                    activeList = true;
                    result.append("<ul>");
                }
                result.append(html);
            } else {
                if (activeList) {
                    activeList = false;
                    result.append("</ul>");
                }
                result.append(html);
            }
        }

        if (activeList) {
            result.append("</ul>");
        }

        return result.toString();
    }

    /**
     * Parses a single line of markdown.
     * 
     * @param markdown The markdown line to parse.
     * @return The HTML representation of the line.
     */
    private String parseLine(String markdown) {
        String html = parseHeader(markdown);
        if (html == null)
            html = parseListItem(markdown);
        if (html == null)
            html = parseParagraph(markdown);
        return html;
    }

    /**
     * Parses headers.
     * 
     * @param markdown The markdown line to present headers.
     * @return The HTML representation of the headers.
     */
    private String parseHeader(String markdown) {
        int count = 0;
        while (count < markdown.length() && markdown.charAt(count) == '#') {
            count++;
        }

        if (count > 0 && count <= 6) {
            return "<h" + count + ">" + markdown.substring(count + 1).trim() + "</h" + count + ">";
        }
        return null;
    }

    /**
     * Parses list items.
     * 
     * @param markdown The markdown list item to parse.
     * @return The HTML representation of the list item.
     */
    private String parseListItem(String markdown) {
        if (markdown.startsWith("*")) {
            return "<li>" + parseSomeSymbols(markdown.substring(1).trim()) + "</li>";
        }
        return null;
    }

    /**
     * Parses paragraphs.
     * 
     * @param markdown The markdown paragraph to parse.
     * @return The HTML representation of the paragraph.
     */
    private String parseParagraph(String markdown) {
        return "<p>" + parseSomeSymbols(markdown) + "</p>";
    }

    /**
     * Parses bold and italic symbols.
     * 
     * @param markdown The markdown content containing symbols.
     * @return The HTML representation of the markdown.
     */
    private String parseSomeSymbols(String markdown) {
        markdown = markdown.replaceAll("__(.+)__", "<strong>$1</strong>");
        return markdown.replaceAll("_(.+)_", "<em>$1</em>");
    }

    /**
     * Checks if a line is a list item.
     * 
     * @param line The markdown line to check.
     * @return true if the line is a list item
     *         false otherwise.
     */
    private boolean isListItem(String line) {
        return line != null && line.startsWith("<li>");
    }
}
