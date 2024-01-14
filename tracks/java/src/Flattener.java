import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Flattener} class provides a method to flatten a nested list of any
 * depth.
 * It handles lists containing elements of any type, including other lists, and
 * removes
 * null values during the flattening process.
 */
public class Flattener {

    /**
     * Flattens a nested list of arbitrary depth.
     * <p>
     * This method takes a list which may contain elements of any type, including
     * other lists (nested to any level), and returns a flat list of all the
     * non-null
     * elements. The order of elements in the flattened list is the same as the
     * order
     * in which they occur in the nested structure.
     * 
     * @param list the nested list to be flattened, may contain elements of any type
     * @return a flattened list containing all non-null elements from the input list
     */
    public List<Object> flatten(List<?> list) {
        List<Object> result = new ArrayList<>();

        for (Object element : list) {
            if (element instanceof List<?>) {
                // Recursively flatten nested lists
                result.addAll(flatten((List<?>) element));
            } else if (element != null) {
                // Add non-null elements
                result.add(element);
            }
        }

        return result;
    }

}
