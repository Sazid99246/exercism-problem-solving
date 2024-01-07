import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The DnDCharacter class represents a character in Dungeons and Dragons.
 * It includes attributes like strength, dexterity, constitution, intelligence,
 * wisdom, and charisma.
 * Each attribute is generated based on dice rolls.
 */
public class DnDCharacter {
    /**
     * Strength attribute of the character.
     */
    private int strength;

    /**
     * Dexterity attribute of the character.
     */
    private int dexterity;

    /**
     * Constitution attribute of the character.
     */
    private int constitution;

    /**
     * Intelligence attribute of the character.
     */
    private int intelligence;

    /**
     * Wisdom attribute of the character.
     */
    private int wisdom;

    /**
     * Charisma attribute of the character.
     */
    private int charisma;

    /**
     * Constructor for DnDCharacter. Initializes attributes with random values based
     * on dice rolls.
     */
    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }

    /**
     * Calculates the ability score from a list of dice roll scores.
     * It removes the lowest roll and sums up the rest.
     * 
     * @param scores A list of integers representing dice rolls.
     * @return The calculated ability score.
     */
    int ability(List<Integer> scores) {
        List<Integer> mutableScores = new ArrayList<>(scores);
        mutableScores.remove(Collections.min(scores));
        int sum = 0;
        for (Integer score : mutableScores) {
            sum += score;
        }
        return sum;
    }

    /**
     * Rolls a dice four times and returns the results.
     * This method simulates the rolling of a six-sided dice.
     * 
     * @return A list of integers representing the results of four dice rolls.
     */
    private List<Integer> rollDice() {
        Random random = new Random();
        ArrayList<Integer> rollScores = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            rollScores.add(random.nextInt(6) + 1);
        }

        return rollScores;
    }

    /**
     * Calculates the modifier for an ability score.
     * The modifier is used in determining various aspects like hitpoints.
     * 
     * @param input The ability score.
     * @return The calculated modifier.
     */
    private int modifier(int input) {
        double num = (input - 10.0) / 2.0;
        return num < 0 ? (int) -Math.ceil(-num) : (int) Math.floor(num);
    }

    // Getter methods with JavaDoc

    // Getter methods with JavaDoc

    /**
     * Gets the strength attribute.
     * 
     * @return The strength score.
     */
    int getStrength() {
        return strength;
    }

    /**
     * Gets the dexterity attribute.
     * 
     * @return The dexterity score.
     */
    int getDexterity() {
        return dexterity;
    }

    /**
     * Gets the constitution attribute.
     * 
     * @return The constitution score.
     */
    int getConstitution() {
        return constitution;
    }

    /**
     * Gets the intelligence attribute.
     * 
     * @return The intelligence score.
     */
    int getIntelligence() {
        return intelligence;
    }

    /**
     * Gets the wisdom attribute.
     * 
     * @return The wisdom score.
     */
    int getWisdom() {
        return wisdom;
    }

    /**
     * Gets the charisma attribute.
     * 
     * @return The charisma score.
     */
    int getCharisma() {
        return charisma;
    }

    /**
     * Calculates and returns the hitpoints based on the constitution modifier.
     * The base hitpoints are 10, to which the constitution modifier is added.
     * 
     * @return The calculated hitpoints.
     */
    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
