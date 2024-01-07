/**
 * The {@code RnaTranscription} class provides a method to transcribe a DNA
 * strand into its RNA complement.
 */
public class RnaTranscription {

    /**
     * Default constructor for RnaTranscription.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public RnaTranscription() {

    }

    /**
     * Transcribes a DNA strand into its RNA complement.
     *
     * <p>
     * This method takes a string representing a DNA strand and returns its RNA
     * complement.
     * The transcription is based on the following rules:
     * </p>
     * <ul>
     * <li>'G' is replaced by 'C'</li>
     * <li>'C' is replaced by 'G'</li>
     * <li>'T' is replaced by 'A'</li>
     * <li>'A' is replaced by 'U'</li>
     * </ul>
     *
     * @param dnaStrand the DNA strand to be transcribed
     * @return the RNA complement of the given DNA strand
     * @throws IllegalArgumentException if the input contains characters other than
     *                                  'G', 'C', 'T', 'A'.
     */
    String transcribe(String dnaStrand) {
        char[] dnaStandArr = dnaStrand.toCharArray();
        for (int i = 0; i < dnaStandArr.length; i++) {
            switch (dnaStandArr[i]) {
                case 'G':
                    dnaStandArr[i] = 'C';
                    break;
                case 'C':
                    dnaStandArr[i] = 'G';
                    break;
                case 'T':
                    dnaStandArr[i] = 'A';
                    break;
                case 'A':
                    dnaStandArr[i] = 'U';
                    break;
                default:
                    throw new IllegalArgumentException("Invalid character in DNA strand: " + dnaStandArr[i]);
            }
        }
        return new String(dnaStandArr);
    }
}
