package perfectNumbers;

/**
 * The {@code Classification} enum represents the three possible classifications
 * for a natural number based on its aliquot sum:
 * <ul>
 * <li>{@code DEFICIENT} - when the sum of the proper divisors of the number is
 * less than the number itself.</li>
 * <li>{@code PERFECT} - when the sum of the proper divisors equals the
 * number.</li>
 * <li>{@code ABUNDANT} - when the sum of the proper divisors exceeds the
 * number.</li>
 * </ul>
 */
public enum Classification {

    /**
     * Indicates that the sum of the proper divisors of the number
     * is less than the number itself.
     */
    DEFICIENT,

    /**
     * Indicates that the sum of the proper divisors of the number
     * equals the number.
     */
    PERFECT,

    /**
     * Indicates that the sum of the proper divisors of the number
     * exceeds the number.
     */
    ABUNDANT
}
