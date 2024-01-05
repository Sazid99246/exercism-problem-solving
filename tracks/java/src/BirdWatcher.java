/**
 * This class represents a bird watcher who keeps track of the number of birds seen each day.
 * It provides functionality to record and analyze bird sighting data over a period of time.
 */
public class BirdWatcher {
    private final int[] birdsPerDay;

    /**
     * Constructs a BirdWatcher with a given array of bird counts per day.
     *
     * @param birdsPerDay An array of integers representing the number of birds seen each day.
     */
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    /**
     * Gets the bird count data for the last week.
     *
     * @return An array of integers representing the number of birds seen each day over the last week.
     */
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    /**
     * Gets the bird count for the current day.
     *
     * @return The number of birds seen today. If no data is available for today, returns 0.
     */
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }

    /**
     * Increments the bird count for the current day by one and returns the updated count.
     *
     * @return The updated bird count for today.
     */
    public int incrementTodaysCount() {
        int idx = birdsPerDay.length - 1;
        birdsPerDay[idx] = ++birdsPerDay[idx];
        return birdsPerDay[idx];
    }

    /**
     * Checks if there was any day without bird sightings.
     *
     * @return true if there was at least one day with zero birds seen; false otherwise.
     */
    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Calculates the total number of birds seen over the first specified number of days.
     *
     * @param numberOfDays The number of days from the start to include in the count.
     * @return The total number of birds seen over the specified number of days.
     */
    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int i = 0; i < numberOfDays; i++) {
            result += birdsPerDay[i];
        }

        return result;
    }

    /**
     * Counts the number of 'busy' days - days when the number of birds seen was five or more.
     *
     * @return The number of busy days.
     */
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
