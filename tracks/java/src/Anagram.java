import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents an Anagram detector. It is used to determine if two
 * strings are anagrams of each other,
 * and to find all anagrams of a given word from a list of candidate words.
 */
public class Anagram {

    /**
     * The word for which anagrams are to be found
     */
    private String word;

    /**
     * A list to store anagrams of the word.
     */
    private List<String> anagrams = new ArrayList<>();

    /**
     * Constructor for the Anagram class.
     *
     * @param word The word for which anagrams are to be found.
     */
    public Anagram(String word) {
        this.word = word;
    }

    /**
     * Checks if the given word is an anagram of the word stored in this class.
     * Two words are anagrams if they contain the same characters in any order.
     * The comparison is case-insensitive and a word is not an anagram of itself.
     *
     * @param word2 The word to check against the stored word.
     * @return true if the given word is an anagram of the stored word; false
     *         otherwise.
     */
    public boolean isAnagram(String word2) {
        String normalizedWord = this.word.toLowerCase();
        String normalizedWord2 = word2.toLowerCase();

        if (normalizedWord.length() == normalizedWord2.length() && !normalizedWord.equals(normalizedWord2)) {
            char[] charArray1 = normalizedWord.toCharArray();
            char[] charArray2 = normalizedWord2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
        return false;
    }

    /**
     * Finds and returns a list of all anagrams in the given list of candidates.
     * The comparison is case-insensitive and excludes the word itself.
     *
     * @param candidates A list of candidate words to check for anagrams.
     * @return A list of anagrams found in the candidate list.
     */
    public List<String> match(List<String> candidates) {
        for (String candidate : candidates) {
            if (isAnagram(candidate)) {
                anagrams.add(candidate);
            }
        }
        return anagrams;
    }
}
