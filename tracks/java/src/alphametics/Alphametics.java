package alphametics;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

class Alphametics {
    private List<String> numbers;
    private String sum;
    private List<Character> uniqueLetters;

    // Constructor to initialize the Alphametics puzzle with the provided input
    Alphametics(String userInput) {
        // Split the input string into numbers and sum based on '+' and '==' delimiters
        String[] parts = userInput.split("\\s*(\\+|==)\\s*");
        this.numbers = Arrays.asList(Arrays.copyOf(parts, parts.length - 1));
        this.sum = parts[parts.length - 1];

        // Extract unique characters (letters) from the input
        Set<Character> uniqueCharSet = extractUniqueCharacters(userInput);
        this.uniqueLetters = new ArrayList<>(uniqueCharSet);
    }
    
    // Extracts unique characters from the given string, ignoring non-letter characters
    private Set<Character> extractUniqueCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars;
    }

    // Generates all possible permutations of r elements out of 10 digits (0-9)
    private List<int[]> generatePermutations(int r) {
        int n = 10; // Digits from 0 to 9
        List<int[]> permutations = new ArrayList<>();
        permute(new int[n], 0, n, r, new boolean[n], permutations);
        return permutations;
    }

    // Recursive helper method to generate permutations
    private void permute(int[] arr, int level, int n, int r, boolean[] used, List<int[]> permutations) {
        if (level == r) {
            int[] permutation = new int[r];
            System.arraycopy(arr, 0, permutation, 0, r);
            permutations.add(permutation);
        } else {
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    arr[level] = i;
                    used[i] = true;
                    permute(arr, level + 1, n, r, used, permutations);
                    used[i] = false;
                }
            }
        }
    }

    Map<Character, Integer> solve() throws UnsolvablePuzzleException {
        List<int[]> permutations = generatePermutations(uniqueLetters.size());

        for (int[] permutation : permutations) {
            Map<Character, Integer> charToDigitMap = createCharToDigitMap(permutation);
            if (isValidSolution(charToDigitMap)) {
                return charToDigitMap;
            }
        }

        throw new UnsolvablePuzzleException();
    }

    private long convertStringToValue(String str, Map<Character, Integer> map) {
        long value = 0;
        for (char c : str.toCharArray()) {
            value = value * 10 + map.get(c);
        }
        return value;
    }
    
    private Map<Character, Integer> createCharToDigitMap(int[] permutation) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < uniqueLetters.size(); i++) {
            map.put(uniqueLetters.get(i), permutation[i]);
        }
        return map;
    }

    
    private boolean isValidSolution(Map<Character, Integer> map) {
    // Check if the sum or any number starts with zero (but is not a single zero)
        if (startsWithZero(sum, map) || numbers.stream().anyMatch(num -> startsWithZero(num, map))) {
            return false;
        }
        
        long sumValue = convertStringToValue(this.sum, map);
        long numbersSum = 0;
        for (String number : numbers) {
            numbersSum += convertStringToValue(number, map);
        }
        return numbersSum == sumValue;
    }

    private boolean startsWithZero(String str, Map<Character, Integer> map) {
        return str.length() > 1 && map.get(str.charAt(0)) == 0;
    }    

    @SuppressWarnings("unused")
    private String replaceCharsWithDigits(String word, Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(map.get(c));
        }
        return sb.toString();
    }

    @SuppressWarnings("unused")
    private boolean hasLeadingZeros(String number) {
        return number.startsWith("0") && number.length() > 1;
    }


}
