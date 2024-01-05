import java.util.HashMap;
import java.util.Map;

/**
 * The NucleotideCounter class is used for counting the frequency of each
 * nucleotide in a DNA sequence.
 * Valid nucleotides are 'A', 'C', 'G', and 'T'.
 */
public class NucleotideCounter {

    /**
     * The array of characters representing the DNA sequence.
     */
    private char[] charArr;

    /**
     * A map to store the count of each nucleotide in the DNA sequence.
     */
    private Map<Character, Integer> map = new HashMap<>() {
        {
            put('A', 0);
            put('C', 0);
            put('G', 0);
            put('T', 0);
        }
    };

    /**
     * Constructs a NucleotideCounter for a given DNA sequence.
     * Counts the occurrence of each nucleotide in the sequence.
     *
     * @param sequence The DNA sequence as a string.
     * @throws IllegalArgumentException If the sequence contains characters other
     *                                  than 'A', 'C', 'G', 'T'.
     */
    NucleotideCounter(String sequence) {
        this.charArr = sequence.toCharArray();

        for (char ch : charArr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                throw new IllegalArgumentException("Invalid nucleotide in DNA sequence: " + ch);
            }
        }
    }

    /**
     * Gets the count of each nucleotide in the DNA sequence.
     *
     * @return A map with the nucleotides ('A', 'C', 'G', 'T') as keys and their
     *         counts as values.
     */
    Map<Character, Integer> nucleotideCounts() {
        return map;
    }

}
