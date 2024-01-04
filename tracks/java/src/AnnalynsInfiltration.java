/**
 * The AnnalynsInfiltration class provides methods to determine various actions
 * in a stealth game scenario.
 * This class includes logic to decide the feasibility of different actions like
 * attacking, spying, signaling a prisoner,
 * or freeing a prisoner based on the states of various characters in the game
 * (like a knight, an archer, and a prisoner)
 * and the presence of a pet dog.
 *
 * Each method in this class returns a boolean value representing the success or
 * possibility of an action
 * based on the given conditions. The class is structured to use static methods
 * so that it can be easily
 * called without instantiating the class.
 */

public class AnnalynsInfiltration {

    public AnnalynsInfiltration() {
        
    }

    /**
     * Determines if a fast attack can be made based on the knight's state.
     * 
     * @param knightIsAwake checks if the knight is awake
     * @return true if the knight is not awake else false
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    /**
     * Determines the ability to spy based on the state of the knight, archer, and
     * prisoner.
     * 
     * @param knightIsAwake   checks if the knight is awake
     * @param archerIsAwake   checks if the archer is awake
     * @param prisonerIsAwake checks if the prisoner is awake
     * @return true if one of them is awake else false
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    /**
     * Determines if it's possible to signal the prisoner based on the archer and
     * prisoner's states.
     * 
     * @param archerIsAwake   checks if the archer is awake
     * @param prisonerIsAwake checks if the prisoner is awake
     * @return true if the archer is not awake and the prisoner is awake otherwise
     *         false
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    /**
     * Determines the possibility of freeing the prisoner based on everyone's state
     * including the pet dog.
     * 
     * @param knightIsAwake   checks if the knight is awake
     * @param archerIsAwake   checks if the archer is awake
     * @param prisonerIsAwake checks if the prisoner is awake
     * @param petDogIsPresent checks if the pet dog is present
     * @return true if the pet dog is present and archer is not awake
     *         or if the pet dog is not present and none other than the prisoner is
     *         awake
     *         false otherwise
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake)
                || (!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake);
    }
}
