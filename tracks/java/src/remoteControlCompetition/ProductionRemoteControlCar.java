package remoteControlCompetition;

/**
 * ProductionRemoteControlCar is an implementation of the RemoteControlCar
 * interface
 * and the Comparable interface for comparing cars based on their number of
 * victories.
 * It represents a production version of a remote-controlled car used in
 * competitions.
 */
public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    /**
     * Default constructor for ProductionRemoteControlCar.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public ProductionRemoteControlCar() {

    }
    /**
     * The distance traveled by the car.
     */
    int distance = 0;

    /**
     * The number of victories this car has achieved in competitions.
     */
    int numberOfVictories = 0;

    /**
     * Drives the remote control car, increasing the distance traveled.
     * Each call to this method increases the distance by 10 units.
     */
    public void drive() {
        this.distance = this.distance + 10;
    }

    /**
     * Gets the total distance traveled by the car.
     *
     * @return The distance traveled by the car in units.
     */
    public int getDistanceTravelled() {
        return this.distance;
    }

    /**
     * Gets the number of victories this car has achieved.
     *
     * @return The number of victories.
     */
    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    /**
     * Sets the number of victories this car has achieved.
     *
     * @param numberOfVictories The number of victories to be set.
     */
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    /**
     * Compares this car with another ProductionRemoteControlCar based on the number
     * of victories.
     *
     * @param otherCar The other ProductionRemoteControlCar to be compared with.
     * @return A negative integer, zero, or a positive integer as this car has more
     *         than,
     *         equal to, or less than the specified number of victories of the other
     *         car.
     */
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(this.numberOfVictories, otherCar.numberOfVictories);
    }
}
