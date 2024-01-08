import java.util.Random;
import java.util.HashSet;

/**
 * The Robot class represents a robot with a unique name.
 * The name is generated when first requested and consists of two uppercase
 * letters followed by three digits.
 * The name remains the same until the robot is reset, at which point a new
 * unique name will be generated upon request.
 */
public class Robot {

    /**
     * Default constructor for Robot.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Robot() {

    }

    /**
     * A HashSet to keep track of all used robot names to ensure uniqueness.
     */
    private static final HashSet<String> usedNames = new HashSet<>();

    /**
     * The robot's name. It's null when the robot is created or reset.
     */
    private String name;

    /**
     * An instance of Random used for generating random parts of the robot's name.
     */
    private final Random random = new Random();

    /**
     * Gets the name of the robot. Generates a new unique name if the robot doesn't
     * have one.
     * 
     * @return The name of the robot.
     */
    String getName() {
        if (name == null) {
            do {
                name = generateName();
            } while (usedNames.contains(name));
            usedNames.add(name);
        }
        return name;
    }

    /**
     * Generates a unique name for the robot. This is a private helper method.
     * The name consists of two uppercase letters followed by three digits.
     * 
     * @return A unique name for the robot.
     */
    private String generateName() {
        StringBuilder nameBuilder = new StringBuilder();
        String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };

        int index1 = random.nextInt(letters.length);
        int index2 = random.nextInt(letters.length);

        nameBuilder.append(letters[index1]);
        nameBuilder.append(letters[index2]);

        for (int i = 1; i <= 3; i++) {
            nameBuilder.append(random.nextInt(10));
        }

        return nameBuilder.toString();
    }

    /**
     * Resets the robot to its factory settings. This method clears the current name
     * of the robot,
     * allowing a new name to be generated when next requested.
     */
    void reset() {
        usedNames.remove(name);
        name = null;
    }
}
