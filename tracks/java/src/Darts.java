/**
 * The Darts class is used to calculate the score in a game of darts based on
 * the coordinates of where a dart lands on the dartboard.
 */
public class Darts {

    /**
     * Default constructor for Darts.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Darts() {

    }

    /**
     * Calculates the score of a dart throw based on its x and y coordinates on the
     * dartboard.
     * The dartboard has different scoring zones:
     * - The bullseye (center) scores 10 points.
     * - The middle circle scores 5 points.
     * - The outer circle scores 1 point.
     * - Outside the outer circle scores 0 points.
     *
     * @param xOfDart the x-coordinate of the dart's landing position
     * @param yOfDart the y-coordinate of the dart's landing position
     * @return the score of the dart throw
     */
    public int score(double xOfDart, double yOfDart) {
        double d = Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
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
