/**
 * The NeedForSpeed class represents a car with adjustable speed and battery
 * drain.
 * It provides functionalities to drive the car and check its battery status.
 */
public class NeedForSpeed {
    /**
     * The rate at which the car's battery is drained.
     */
    private int batteryDrain;

    /**
     * The speed of the car.
     */
    private int speed;

    /**
     * The total distance driven by the car.
     */
    private int distanceDriven;

    /**
     * The remaining battery percentage of the car.
     */
    private int remainingBattery = 100;

    /**
     * Constructs a NeedForSpeed car with specified speed and battery drain.
     *
     * @param speed        The speed of the car.
     * @param batteryDrain The rate at which the car's battery is drained.
     */
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    /**
     * Checks if the car's battery is drained.
     *
     * @return {@code true} if the battery is drained, {@code false} otherwise.
     */
    public boolean batteryDrained() {
        return this.remainingBattery < this.batteryDrain;
    }

    /**
     * Returns the total distance driven by the car.
     *
     * @return The distance driven.
     */
    public int distanceDriven() {
        return this.distanceDriven;
    }

    /**
     * Drives the car, increasing the distance driven and decreasing the remaining
     * battery.
     */
    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += this.speed;
            this.remainingBattery -= this.batteryDrain;
        }
    }

    /**
     * Creates a NeedForSpeed car with high speed and moderate battery drain (Nitro
     * mode).
     *
     * @return A new NeedForSpeed car in Nitro mode.
     */
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

/**
 * The RaceTrack class represents a race track with a specific distance to be
 * covered.
 */
class RaceTrack {

    /**
     * The total distance of the race track.
     */
    private int distance;

    /**
     * Constructs a RaceTrack with a given distance.
     *
     * @param distance The total distance of the race track.
     */
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    /**
     * Attempts to finish the race track with a given car.
     * The car will drive until it either finishes the track or its battery is
     * drained.
     *
     * @param car The NeedForSpeed car attempting to finish the track.
     * @return {@code true} if the car finishes the track, {@code false} if the
     *         battery is drained first.
     */
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < this.distance) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
