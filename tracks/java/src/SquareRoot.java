public class SquareRoot {

    public int squareRoot(int radicand) {
        if (radicand == 0 || radicand == 1) {
            return radicand;
        }
        int x = radicand / 2; // Initial guess
        double lastX = 0; // To store last guess
        while (Math.abs(x - lastX) > 0.0001) {
            lastX = x;
            x = (x + radicand / x) / 2;
        }
        return x;
    }
}
