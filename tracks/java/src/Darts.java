public class Darts {
    int score(double xOfDart, double yOfDart) {
        double d =  Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
        int result = 0;
        if (d > 10) {
            result = 0;
        } else if (5 < d && d <= 10) {
            result = 1;
        } else if (1 < d && d <= 5) {
            result = 5;
        } else if (d <= 1) {
            result = 10;
        }
        return result;
    }
}
