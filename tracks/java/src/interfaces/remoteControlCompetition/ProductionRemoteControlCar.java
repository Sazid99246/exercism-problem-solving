package interfaces.remoteControlCompetition;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int numberOfVictories = 0;

    public void drive() {
        this.distance = this.distance + 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar a) {
        if (this.numberOfVictories > a.numberOfVictories) {
            return -1;
        } else if (this.numberOfVictories == a.numberOfVictories) {
            return 0;
        } else {
            return 1;
        }
    }
}