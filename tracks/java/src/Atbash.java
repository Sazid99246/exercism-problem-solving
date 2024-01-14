import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The {@code Atbash} class provides methods for encoding and decoding text
 * using the Atbash cipher.
 * The Atbash cipher is a simple substitution cipher originally used to encrypt
 * the Hebrew alphabet,
 * but it can be adapted for any alphabet. In this implementation, it is used
 * for the English alphabet.
 * The cipher substitutes each letter in the plaintext with the letter
 * symmetrically opposite to it
 * in the alphabet, so 'a' becomes 'z', 'b' becomes 'y', and so on.
 */
public class Atbash {

    private String plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
    private String reverseAlphabet = new StringBuffer(plainAlphabet).reverse().toString();

    /**
     * Encodes a plaintext string using the Atbash cipher.
     * Non-letter characters are retained as is, and the encoded text is grouped
     * into words of five letters.
     *
     * @param input the plaintext string to be encoded
     * @return the encoded string using the Atbash cipher
     */
    String encode(String input) {
        List<Character> outputChars = codeyThings(input, plainAlphabet, reverseAlphabet);
        return addWordSpacing(outputChars);
    }

    /**
     * Decodes a text string that was encoded using the Atbash cipher.
     * Non-letter characters are retained as is in the decoded text.
     *
     * @param input the encoded string to be decoded
     * @return the decoded plaintext string
     */
    String decode(String input) {
        List<Character> outputChars = codeyThings(input, reverseAlphabet, plainAlphabet);
        return outputChars.stream().map(Object::toString).collect(Collectors.joining(""));
    }

    /**
     * Helper method to perform the core encoding or decoding operation.
     * This method maps characters from the input source alphabet to the target
     * alphabet.
     *
     * @param input               the input string to be processed
     * @param inputSourceAlphabet the source alphabet for mapping characters
     * @param toBeAlphabet        the target alphabet for mapping characters
     * @return a list of characters representing the processed output
     */
    private List<Character> codeyThings(String input, String inputSourceAlphabet, String toBeAlphabet) {
        List<Character> outputChars = new ArrayList<>();

        for (var c : input.toLowerCase().toCharArray()) {
            if (Character.isDigit(c)) {
                outputChars.add(c);
            }
            var plainIndex = inputSourceAlphabet.indexOf(c);
            if (0 <= plainIndex && plainIndex < toBeAlphabet.length()) {
                outputChars.add(toBeAlphabet.charAt(plainIndex));
            }
        }
        return outputChars;
    }

    /**
     * Adds spaces to the output string for readability. Groups the characters into
     * sets of five.
     *
     * @param chars the list of characters to be grouped
     * @return a string with added spaces for word separation
     */
    private String addWordSpacing(List<Character> chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.size(); i++) {
            if (i > 0 && i % 5 == 0) {
                sb.append(" ");
            }
            sb.append(chars.get(i));
        }
        return sb.toString();
    }

}