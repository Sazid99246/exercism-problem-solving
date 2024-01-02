package classes;

public class ElonsToyCar {

    private int distanceDriven = 0;
    private int batteryStatus = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryStatus <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + this.batteryStatus + "%";
        }

    }

    public void drive() {
        if (this.batteryStatus > 0) {
            this.distanceDriven += 20;
            this.batteryStatus--;
        }
    }
}