import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The {@code VariableLengthQuantity} class provides methods for encoding and
 * decoding
 * integers using Variable Length Quantity (VLQ) encoding. This form of encoding
 * is
 * used to represent integers in a compact byte format where smaller numbers use
 * fewer
 * bytes. It is particularly effective for encoding large integers.
 */
public class VariableLengthQuantity {

    /**
     * Encodes a list of long integers into their VLQ representation.
     * Each integer is encoded into a series of bytes, with each byte containing
     * 7 bits of the integer. The most significant bit of each byte is a
     * continuation
     * flag: 1 indicates that the next byte is part of the same integer, and 0
     * indicates
     * that this is the last byte for the current integer.
     *
     * @param numbers the list of long integers to be encoded
     * @return a list of strings representing the VLQ encoded bytes in hexadecimal
     *         format
     */
    List<String> encode(List<Long> numbers) {
        List<String> result = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            result.add(String.format("0x%x", numbers.get(i) & 0x7f));
            long num = numbers.get(i) >> 7;
            while (num != 0) {
                result.add(String.format("0x%x", num & 0x7f | 0x80));
                num >>= 7;
            }
        }

        Collections.reverse(result);

        return result;
    }

    /**
     * Decodes a list of bytes, representing VLQ encoded integers, back into their
     * original
     * integer values. Each byte is expected to follow the VLQ encoding format, and
     * this
     * method combines them to reconstruct the original integers.
     *
     * @param bytes the list of long integers representing VLQ encoded bytes
     * @return a list of strings representing the decoded integers in hexadecimal
     *         format
     * @throws IllegalArgumentException if the input encoding is invalid
     */
    List<String> decode(List<Long> bytes) {
        List<String> result = new ArrayList<>();
        long num = 0;
        int i = 0;

        while (i < bytes.size()) {
            if (LeadingZeros(num) >= 7) {
                num = (num << 7) | (long) (bytes.get(i) & 0x7f);
            } else {
                throw new IllegalArgumentException("Invalid variable-length quantity encoding");
            }
            if ((bytes.get(i) & 0x80) == 0) {
                result.add(String.format("0x%x", num));
                num = 0;
                i++;
                continue;
            } else if (i == bytes.size() - 1) {
                throw new IllegalArgumentException("Invalid variable-length quantity encoding");
            }
            i++;
        }

        return result;
    }

    /**
     * Calculates the number of leading zeros in a 32-bit long integer.
     * This method is used internally to determine the valid number of bits
     * that can be shifted in the VLQ decoding process.
     *
     * @param input the long integer to be checked for leading zeros
     * @return the number of leading zeros in the integer
     */
    int LeadingZeros(long input) {
        int result = 0;
        long mask = 0x80000000;
        while ((input & mask) == 0 && result != 32) {
            result++;
            mask >>= 1;
        }
        return result;
    }
}