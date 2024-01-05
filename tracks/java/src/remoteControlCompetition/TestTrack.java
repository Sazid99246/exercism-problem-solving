package remoteControlCompetition;

import java.util.List;
import java.util.Collections;

/**
 * The TestTrack class contains methods for testing and ranking remote control
 * cars.
 * It provides functionality to simulate a race and to rank cars based on their
 * performance.
 */
public class TestTrack {

    /**
     * Simulates a race for the given remote control car.
     * This method calls the drive method of the provided RemoteControlCar.
     * 
     * @param car The RemoteControlCar to be raced.
     */
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    /**
     * Ranks a list of ProductionRemoteControlCar objects based on their number of
     * victories.
     * The cars are sorted in descending order of victories.
     *
     * @param cars A list of ProductionRemoteControlCar objects to be ranked.
     * @return A sorted list of ProductionRemoteControlCar objects based on the
     *         number of victories.
     */
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
