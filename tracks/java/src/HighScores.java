import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a record of high scores.
 */
public class HighScores {

    /**
     * A list that stores the high scores.
     */
    List<Integer> highScores;

    /**
     * Constructs a new HighScores object with the given list of scores.
     *
     * @param highScores The initial list of high scores.
     */
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    /**
     * Retrieves the list of high scores.
     *
     * @return A list of high scores.
     */
    List<Integer> scores() {
        return highScores;
    }

    /**
     * Retrieves the latest (most recent) score.
     *
     * @return The latest score.
     */
    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    /**
     * Retrieves the highest score in the list of high scores.
     *
     * @return The highest score.
     */
    Integer personalBest() {
        return Collections.max(highScores);
    }

    /**
     * Retrieves the top three scores from the list of high scores.
     * If there are fewer than three scores, it returns all the scores.
     *
     * @return A list containing the top three scores.
     */
    List<Integer> personalTopThree() {
        List<Integer> topThree = new ArrayList<>(highScores);
        Collections.sort(topThree, Collections.reverseOrder());
        return topThree.subList(0, Math.min(3, topThree.size()));
    }
}
