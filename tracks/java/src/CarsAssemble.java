/**
 * The CarsAssemble class represents a car assembly line. It calculates the
 * production rate of cars based on the speed of the assembly line.
 */
public class CarsAssemble {

    /**
     * Default constructor for CarsAssemble.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public CarsAssemble() {

    }

    /**
     * Stores the success rate depending on the conditions
     */
    private double successRate;

    /**
     * Calculates the production rate of cars per hour based on the assembly line
     * speed.
     * The success rate varies depending on the speed:
     * Speed 1 to 4: 100% success rate.
     * Speed 5 to 8: 90% success rate.
     * Speed 9: 80% success rate.
     * Speed 10: 77% success rate.
     *
     * @param speed the speed of the assembly line (1 to 10)
     * @return the number of cars produced per hour at the given speed
     */
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }

        return successRate * speed * 221;
    }

    /**
     * Calculates the number of working items produced per minute based on the
     * assembly line speed.
     *
     * @param speed the speed of the assembly line (1 to 10)
     * @return the number of working items produced per minute at the given speed
     */
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
