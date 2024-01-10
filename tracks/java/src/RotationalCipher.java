/**
 * The {@code RotationalCipher} class represents a simple rotational cipher for
 * text encryption.
 * It works by shifting each letter in the input text by a specified number of
 * positions in the alphabet.
 */
public class RotationalCipher {

    /**
     * The shift key used for the rotational cipher. It represents the number of
     * positions
     * each letter in the text will be shifted. This shift is applied circularly to
     * the alphabet.
     */
    private int shiftKey;

    /**
     * Constructs a new rotational cipher with a given shift key.
     *
     * @param shiftKey The number of positions each letter in the text will be
     *                 shifted.
     */
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    /**
     * Rotates (shifts) the characters in the provided string according to the
     * cipher's shift key.
     * Letters are rotated while other characters (like digits, spaces, punctuation)
     * remain unchanged.
     *
     * The rotation is circular, meaning that it wraps around the alphabet. For
     * example, shifting 'z' by 1 results in 'a'.
     *
     * @param data The string to be rotated.
     * @return The rotated string with each letter shifted by the cipher's shift
     *         key.
     */
    String rotate(String data) {
        StringBuilder rotatedData = new StringBuilder();

        for (char d : data.toCharArray()) {
            if (Character.isLetter(d)) {
                char base = Character.isUpperCase(d) ? 'A' : 'a';
                char newChar = (char) ((d - base + shiftKey) % 26 + base);
                rotatedData.append(newChar);
            } else {
                rotatedData.append(d);
            }
        }

        return rotatedData.toString();
    }

}
