/**
 * The Leap class provides functionality to determine whether a given year is a
 * leap year.
 * A leap year occurs typically every four years to help synchronize the
 * calendar year with the solar year.
 */
public class Leap {

     /**
     * Default constructor for Leap.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Leap() {

    }

    /**
     * Determines if a given year is a leap year.
     * A year is a leap year if it is divisible by 4 but not by 100, except for
     * years that are divisible by 400.
     *
     * @param year the year to check
     * @return {@code true} if the year is a leap year, {@code false} otherwise
     */
    boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
