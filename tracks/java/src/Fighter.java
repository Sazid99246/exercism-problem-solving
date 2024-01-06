/**
 * The abstract Fighter class represents a generic fighter character in a game.
 * It defines the basic structure and behavior shared by all types of fighters.
 */
abstract class Fighter {

    /**
     * Default constructor for Fighter.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Fighter() {

    }

    /**
     * Determines if the fighter is vulnerable.
     *
     * @return {@code true} if the fighter is vulnerable, otherwise {@code false}.
     */
    boolean isVulnerable() {
        return false;
    }

    /**
     * Calculates the damage points this fighter can inflict on another fighter.
     *
     * @param fighter the opposing fighter
     * @return the damage points inflicted
     */
    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}

/**
 * The Warrior class represents a warrior-type fighter.
 * A warrior inflicts different damage depending on the vulnerability of the
 * opponent.
 */
class Warrior extends Fighter {

    /**
     * Default constructor for Warrior.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Warrior() {

    }

    /**
     * Calculates the damage points this wizard can inflict on an opponent.
     * The damage inflicted by the wizard varies depending on whether a spell
     * is prepared. With a spell prepared, the wizard deals higher damage,
     * representing increased magical power. Without a prepared spell,
     * the damage inflicted is less, indicating a reduced combat effectiveness.
     *
     * @param wizard The opposing fighter. This parameter is expected to be an
     *                instance
     *                of a class that extends the Fighter abstract class.
     * @return An integer representing the damage points inflicted. If a spell is
     *         prepared, the wizard inflicts greater damage. Otherwise, a lower
     *         standard damage value is inflicted.
     */
    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

/**
 * The Wizard class represents a wizard-type fighter.
 * A wizard can prepare a spell to increase its damage and decrease its
 * vulnerability.
 */
class Wizard extends Fighter {
    
    /**
     * Default constructor for Wizard.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Wizard() {

    }

    /**
     * Indicates whether the wizard has prepared a spell.
     * When a spell is prepared, the wizard becomes less vulnerable and
     * is capable of dealing more damage to opponents. This variable is set to
     * {@code true} when the spell is prepared and {@code false} otherwise.
     */
    private boolean spellPrepared = false;

    /**
     * Determines if the wizard is vulnerable.
     * A wizard becomes less vulnerable when a spell is prepared. This method
     * checks the state of the 'spellPrepared' variable to determine the
     * vulnerability of the wizard. If a spell is prepared (spellPrepared is true),
     * the wizard is considered less vulnerable, otherwise more vulnerable.
     *
     * @return {@code true} if the wizard is vulnerable (i.e., no spell is
     *         prepared),
     *         otherwise {@code false}.
     */
    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    /**
     * Calculates and returns the damage points this warrior inflicts on an
     * opponent.
     * The amount of damage inflicted depends on whether the opponent is vulnerable.
     * When the opponent is vulnerable, a higher amount of damage is dealt,
     * representing the warrior's advantage in this situation.
     * 
     * @param fighter The opposing fighter. This parameter is expected to be an
     *                instance
     *                of a class that extends the Fighter abstract class.
     * @return An integer representing the damage points inflicted. If the opponent
     *         (fighter) is vulnerable, the warrior inflicts greater damage.
     *         Otherwise, a standard damage value is inflicted.
     */
    @Override
    int damagePoints(Fighter fighter) {
        return isVulnerable() ? 3 : 12;
    }

    /**
     * Prepares a spell, making the wizard less vulnerable and able to deal more
     * damage.
     */
    void prepareSpell() {
        spellPrepared = true;
    }
}
