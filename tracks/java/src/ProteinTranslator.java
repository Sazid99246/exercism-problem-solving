import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The ProteinTranslator class provides functionality to translate an RNA
 * sequence into a sequence of proteins.
 */
public class ProteinTranslator {

    /**
     * Default constructor for ProteinTranslator.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public ProteinTranslator() {

    }

    /**
     * Translates a given RNA sequence into a list of proteins.
     * 
     * @param rnaSequence The RNA sequence to be translated.
     * @return A List of proteins corresponding to the RNA sequence.
     */
    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        List<String> codons = splitIntoCodons(rnaSequence, 3);
        proteins = addProteins(codons);
        return proteins;
    }

    /**
     * Adds proteins to the list based on the given codons.
     * 
     * @param codons List of codons to be translated into proteins.
     * @return A List of proteins corresponding to the given codons.
     * @throws IllegalArgumentException if a codon is invalid or not of length 3.
     */
    public static List<String> addProteins(List<String> codons) {
        List<String> proteins = new ArrayList<>();

        for (String codon : codons) {
            if (codon.length() != 3) {
                throw new IllegalArgumentException("Invalid codon");
            } else if (Objects.equals(codon, "AUG")) {
                proteins.add("Methionine");
            } else if (Objects.equals(codon, "UUU") || Objects.equals(codon, "UUC")) {
                proteins.add("Phenylalanine");
            } // ... continue with other codons ...
            else if (Objects.equals(codon, "UGG")) {
                proteins.add("Tryptophan");
            } else if (isStopCodon(codon)) {
                return proteins;
            } else {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return proteins;
    }

    /**
     * Splits a given string into substrings of a specified length.
     * 
     * @param input The string to be split.
     * @param size  The length of each substring.
     * @return A List of substrings.
     */
    public static List<String> splitIntoCodons(String input, int size) {
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < input.length(); i += size) {
            int endIndex = Math.min(i + size, input.length());
            parts.add(input.substring(i, endIndex));
        }
        return parts;
    }

    /**
     * Checks if the given codon is a stop codon.
     * 
     * @param codon The codon to check.
     * @return true if it's a stop codon, false otherwise.
     */
    private static boolean isStopCodon(String codon) {
        return Objects.equals(codon, "UAA") || Objects.equals(codon, "UAG") || Objects.equals(codon, "UGA");
    }
}
