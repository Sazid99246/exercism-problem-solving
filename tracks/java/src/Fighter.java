/**
 * The abstract Fighter class represents a generic fighter character in a game.
 * It defines the basic structure and behavior shared by all types of fighters.
 */
abstract class Fighter {

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
    private boolean spellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

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
