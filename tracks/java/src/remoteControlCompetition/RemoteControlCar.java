package remoteControlCompetition;

/**
 * The RemoteControlCar interface defines the essential functionalities of a
 * remote control car.
 * Implementing classes are expected to provide specific implementations for
 * these functionalities.
 */
public interface RemoteControlCar {

    /**
     * Drives the remote control car. Implementations will define how this method
     * affects the car's state,
     * such as changing its position or increasing the distance traveled.
     */
    void drive();

    /**
     * Retrieves the total distance traveled by the car.
     * 
     * @return The distance traveled by the car in units.
     */
    int getDistanceTravelled();
}
