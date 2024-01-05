/**
 * The ElonsToyCar class represents a toy car that can be driven until its
 * battery runs out.
 * It keeps track of the distance driven and the battery status.
 */
public class ElonsToyCar {

    private int distanceDriven = 0;
    private int batteryStatus = 100;

    /**
     * Factory method to create a new ElonsToyCar.
     *
     * @return a new instance of ElonsToyCar
     */
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    /**
     * Provides a display message indicating the total distance driven by the car.
     *
     * @return a string representing the distance driven in meters
     */
    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    /**
     * Provides a display message indicating the current battery status of the car.
     *
     * @return a string representing the current battery status as a percentage or a
     *         message indicating the battery is empty
     */
    public String batteryDisplay() {
        if (batteryStatus <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + this.batteryStatus + "%";
        }
    }

    /**
     * Drives the car, increasing the distance driven by 20 meters and decreasing
     * the battery status by 1%.
     * If the battery is empty, the car cannot be driven.
     */
    public void drive() {
        if (this.batteryStatus > 0) {
            this.distanceDriven += 20;
            this.batteryStatus--;
        }
    }
}
