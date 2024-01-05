/**
 * This class is responsible for generating a string representation of a badge.
 * It includes the ID, name, and department of a person.
 */
public class Badge {

    /**
     * Default constructor for Badge.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Badge() {

    }

    /**
     * Generates a badge information string.
     * The badge information includes the ID (if present), name, and department of a
     * person.
     * If the department is not provided, it defaults to "OWNER". The department
     * name is converted to uppercase.
     *
     * @param id         the unique identifier for the person, can be null
     * @param name       the name of the person, cannot be null
     * @param department the department in which the person works, can be null
     * @return a formatted string representing the badge information
     * @throws NullPointerException if the name is null
     */
    public String print(Integer id, String name, String department) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null.");
        }

        StringBuilder badgeInfo = new StringBuilder();

        if (id != null) {
            badgeInfo.append("[").append(id).append("] - ");
        }

        badgeInfo.append(name);

        badgeInfo.append(" - ").append(department != null ? department.toUpperCase() : "OWNER");

        return badgeInfo.toString();
    }
}
