package remoteControlCompetition;

/**
 * ExperimentalRemoteControlCar is an implementation of the RemoteControlCar
 * interface.
 * This class represents a remote-controlled car with experimental features.
 * It tracks the distance the car has traveled and provides functionality to
 * drive the car.
 */
public class ExperimentalRemoteControlCar implements RemoteControlCar {

    /**
     * Default constructor for ExperimentalRemoteControlCar.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public ExperimentalRemoteControlCar() {

    }

    /**
     * The distance traveled by the car.
     */
    int distance = 0;

    /**
     * Drives the remote control car, increasing the distance traveled.
     * Each call to this method increases the distance by 20 units.
     */
    public void drive() {
        this.distance = this.distance + 20;
    }

    /**
     * Gets the total distance traveled by the car.
     *
     * @return The distance traveled by the car in units.
     */
    public int getDistanceTravelled() {
        return this.distance;
    }
}
