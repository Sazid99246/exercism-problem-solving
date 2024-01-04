import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {

    private int level;
    private int[] set;
    private Set<Integer> multiples = new HashSet<>();

    SumOfMultiples(int number, int[] set) {
        this.level = number;
        this.set = set;
        getMultiples();
    }

    private void getMultiples() {
        for (Integer divisor : set) {
            for (int i = 1; i < level; i++) {
                if (i * divisor < level) {
                    multiples.add(i * divisor);
                }
            }
        }
    }

    int getSum() {
        int sum = 0;

        for (Integer multiple : multiples) {
            sum += multiple;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] set = { 3, 5 };
        SumOfMultiples sumOfMultiples = new SumOfMultiples(20, set);
        System.out.println(sumOfMultiples.getSum());
    }

}
