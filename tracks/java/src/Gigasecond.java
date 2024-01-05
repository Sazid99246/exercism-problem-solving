import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * The Gigasecond class represents a gigasecond (1,000,000,000 seconds) addition
 * to a specific date and time.
 */
public class Gigasecond {

    /**
     * Default constructor for Gigasecond.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public Gigasecond() {

    }

    /**
     * The initial date and time from which the gigasecond is added.
     */
    private LocalDateTime dateTime;

    /**
     * Constructs a Gigasecond instance starting from a specific date.
     * The time is assumed to be at the start of the day (midnight).
     *
     * @param moment The date from which the gigasecond is added.
     */
    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atTime(0, 0);
    }

    /**
     * Constructs a Gigasecond instance starting from a specific date and time.
     *
     * @param moment The date and time from which the gigasecond is added.
     */
    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    /**
     * Returns the date and time that is exactly one gigasecond (1,000,000,000
     * seconds)
     * after the initial date and time specified in the constructor.
     *
     * @return The date and time one gigasecond after the initial moment.
     */
    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(1000000000);
    }
}
