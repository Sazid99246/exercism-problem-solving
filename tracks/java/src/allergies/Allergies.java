package allergies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The {@code Allergies} class represents a set of allergies.
 * It allows checking against various allergens to determine if there is an
 * allergic reaction,
 * and provides a list of allergens that cause reactions based on a given
 * allergy score.
 */
public class Allergies {
    /**
     * The allergy score that determines which allergens cause reactions.
     * It is typically represented as a bitwise sum of allergens.
     */
    private int score;

    /**
     * Constructs an {@code Allergies} object with a specified allergy score.
     * 
     * @param score The allergy score, typically a bitwise sum of allergens.
     */
    Allergies(int score) {
        this.score = score;
    }

    /**
     * Checks if there is an allergic reaction to a specified allergen.
     * This method uses bitwise operation to determine if the allergen's score is a
     * part of the overall allergy score.
     * 
     * @param allergen The allergen to check against.
     * @return {@code true} if there is an allergic reaction to the specified
     *         allergen,
     *         otherwise {@code false}.
     */
    boolean isAllergicTo(Allergen allergen) {
        return (score & allergen.getScore()) != 0;
    }

    /**
     * Provides a list of allergens that cause allergic reactions based on the
     * allergy score.
     * This method filters all possible allergens and includes those that elicit an
     * allergic reaction.
     * 
     * @return A {@code List} of {@code Allergen} objects to which there is an
     *         allergic reaction.
     */
    List<Allergen> getList() {
        return Arrays.stream(Allergen.values())
                .filter(this::isAllergicTo)
                .collect(Collectors.toList());
    }
}
