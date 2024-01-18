/**
 * The Secrets class provides static methods for performing various bitwise
 * operations.
 * These operations include shifting bits, setting specific bits, flipping bits,
 * and clearing bits
 * in an integer value. This class is useful for low-level bit manipulation
 * tasks.
 */
public class Secrets {

    /**
     * Performs a logical right shift on the given value by the specified amount.
     * This method shifts the bits of the value to the right and fills the leftmost
     * bits with zeros, regardless of the sign of the original value.
     *
     * @param value  The integer to be shifted.
     * @param amount The number of positions to shift the value to the right.
     * @return The result of the logical right shift.
     */
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    /**
     * Sets specific bits of the given value to 1 according to the specified mask.
     * This method performs a bitwise OR operation between the value and the mask.
     *
     * @param value The original integer value.
     * @param mask  The mask specifying which bits to set. Bits that are 1 in the
     *              mask will be set in the value.
     * @return The result of setting the specified bits in the value.
     */
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    /**
     * Flips specific bits of the given value according to the specified mask.
     * This method performs a bitwise XOR operation between the value and the mask.
     * Bits that are 1 in the mask will be flipped in the value.
     *
     * @param value The original integer value.
     * @param mask  The mask specifying which bits to flip. Bits that are 1 in the
     *              mask will be flipped in the value.
     * @return The result of flipping the specified bits in the value.
     */
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    /**
     * Clears specific bits of the given value according to the specified mask.
     * This method performs a bitwise AND operation between the value and the
     * bitwise NOT of the mask.
     * Bits that are 1 in the mask will be cleared in the value.
     *
     * @param value The original integer value.
     * @param mask  The mask specifying which bits to clear. Bits that are 1 in the
     *              mask will be cleared in the value.
     * @return The result of clearing the specified bits in the value.
     */
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}
