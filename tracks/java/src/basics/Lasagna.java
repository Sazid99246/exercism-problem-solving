package basics;

public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinuteInOven) {
        return expectedMinutesInOven() - actualMinuteInOven;
    }

    public int preparationTimeInMinutes(int layerCount) {
        return layerCount * 2;
    }

    public int totalTimeInMinutes(int layerCount, int actualMinuteInOven) {
        return preparationTimeInMinutes(layerCount) + actualMinuteInOven;
    }

}
