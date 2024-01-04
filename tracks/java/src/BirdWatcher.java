public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }

    public int incrementTodaysCount() {
        int idx = birdsPerDay.length - 1;
        birdsPerDay[idx] = ++birdsPerDay[idx];
        return birdsPerDay[idx];
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;

        if (numberOfDays > birdsPerDay.length) {
            for (int i = 0; i < birdsPerDay.length; i++) {
                result += birdsPerDay[i];
            }
            return result;
        }

        for (int i = 0; i < numberOfDays; i++) {
            result += birdsPerDay[i];
        }

        return result;
    }

    public int getBusyDays() {
        int countBusyDays = 0;

        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                countBusyDays++;
            }
        }
        
        return countBusyDays;
    }
}
