import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseConverter {

    private int originalBase;
    private int[] originalDigits;

    BaseConverter(int originalBase, int[] originalDigits) {
        if (originalBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        } else if (Arrays.stream(originalDigits).anyMatch(e -> e < 0)) {
            throw new IllegalArgumentException("Digits may not be negative.");
        } else if (Arrays.stream(originalDigits).anyMatch(e -> e >= originalBase)) {
            throw new IllegalArgumentException("All digits must be strictly less than the base.");
        }
        this.originalBase = originalBase;
        this.originalDigits = originalDigits;
    }

    List<Integer> convertToBase(int newBase) {
        if (newBase < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        List<Integer> result = new ArrayList<>();
        int numberInBaseTen = 0;
        for (int i = 0; i < originalDigits.length; i++) {
            numberInBaseTen += (int) (originalDigits[i] * Math.pow(originalBase, originalDigits.length - 1 - i));
        }
        while (numberInBaseTen / newBase > 0) {
            result.add(0, numberInBaseTen % newBase);
            numberInBaseTen /= newBase;
        }
        result.add(0, numberInBaseTen % newBase);
        return result;
    }
}