import java.util.ArrayList;
import java.util.List;

public class Series {
    private String string;

    Series(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("series cannot be empty");
        }
        this.string = string;
    }

    List<String> slices(int num) {
        if (num > string.length()) {
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        }
        if (num <= 0) {
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        }

        List<String> series = new ArrayList<>();

        char[] stringSeries = string.toCharArray();
        for (int i = 0; i <= stringSeries.length - num; i++) {
            series.add(new String(stringSeries, i, num));
        }
        return series;
    }

    public static void main(String[] args) {
        Series series = new Series("49142");
        List<String> slices = series.slices(3);
        for (String slice : slices) {
            System.out.println(slice);
        }
    }
}
