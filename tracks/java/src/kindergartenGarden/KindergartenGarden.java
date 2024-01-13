package kindergartenGarden;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a kindergarten garden where each student is assigned a section of
 * the garden.
 * The garden is represented as a string with rows, each containing plants coded
 * by their initials.
 */
public class KindergartenGarden {
    private List<String> childs = new ArrayList<>() {
        {
            add("Alice");
            add("Bob");
            add("Charlie");
            add("David");
            add("Eve");
            add("Fred");
            add("Ginny");
            add("Harriet");
            add("Ileana");
            add("Joseph");
            add("Kincaid");
            add("Larry");
        }
    };
    private String[] gardens;
    private char[] firstRow;
    private char[] secondRow;

    /**
     * Constructs a KindergartenGarden with the given garden layout.
     * The garden layout should be provided as a string, with each row separated by
     * a newline character.
     *
     * @param garden The string representation of the garden layout.
     */
    KindergartenGarden(String garden) {
        this.gardens = garden.split("\n");
        this.firstRow = gardens[0].toCharArray();
        this.secondRow = gardens[1].toCharArray();
    }

    /**
     * Returns a list of plants assigned to a specific student in the garden.
     * Each student has a designated section in the garden represented by two
     * consecutive characters
     * in each row of the garden layout.
     *
     * @param student The name of the student whose plants are to be retrieved.
     * @return A list of {@link Plant} representing the plants assigned to the given
     *         student.
     */
    List<Plant> getPlantsOfStudent(String student) {
        int studentPosition = childs.indexOf(student) + 1;
        int[] plantsPosition = { (studentPosition * 2) - 2, (studentPosition * 2) - 1 };

        List<Plant> studentPlants = new ArrayList<>() {
            {
                add(Plant.getPlant(firstRow[plantsPosition[0]]));
                add(Plant.getPlant(firstRow[plantsPosition[1]]));
                add(Plant.getPlant(secondRow[plantsPosition[0]]));
                add(Plant.getPlant(secondRow[plantsPosition[1]]));
            }
        };

        return studentPlants;
    }
}
