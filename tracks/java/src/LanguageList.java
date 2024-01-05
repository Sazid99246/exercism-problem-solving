import java.util.ArrayList;
import java.util.List;

/**
 * The LanguageList class maintains a list of programming languages.
 * It provides functionalities to add, remove, and query languages in the list.
 */
public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    /**
     * Default constructor for LanguageList.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public LanguageList() {

    }

    /**
     * Checks if the list of languages is empty.
     *
     * @return {@code true} if the list is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    /**
     * Adds a new language to the list.
     *
     * @param language The programming language to be added.
     */
    public void addLanguage(String language) {
        languages.add(language);
    }

    /**
     * Removes a language from the list.
     *
     * @param language The programming language to be removed.
     */
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    /**
     * Retrieves the first language in the list.
     *
     * @return The first programming language in the list.
     * @throws IndexOutOfBoundsException if the list is empty.
     */
    public String firstLanguage() {
        return languages.get(0);
    }

    /**
     * Counts the number of languages in the list.
     *
     * @return The number of programming languages in the list.
     */
    public int count() {
        return languages.size();
    }

    /**
     * Checks if a specific language is present in the list.
     *
     * @param language The programming language to check for.
     * @return {@code true} if the language is in the list, {@code false} otherwise.
     */
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    /**
     * Determines if the list contains either Java or Kotlin, which are considered
     * exciting languages.
     *
     * @return {@code true} if the list contains Java or Kotlin, {@code false}
     *         otherwise.
     */
    public boolean isExciting() {
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
