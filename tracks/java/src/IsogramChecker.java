/**
 * The class IsogramChecker will check any letter contains more than one time
 * in a phrase. it will return false if any letter seems to be more than one time.
 * otherwise it will return true.
 * It also converts the phrase to lowercase, for deep checking.
*/
public class IsogramChecker {

    /**
     * The default constructor for the IsogramChecker class. It doesn't have any task.
     */
    public IsogramChecker() {

    }
    
    /**
     * Checks if a phrase is a isogram or not, depending on the duplicacy of any letter.
     * @param phrase the phrase to check for isogram.
     * @return true if the phrase has no duplicate values, or false otherwise
     */
    boolean isIsogram(String phrase) {

        phrase = phrase.replaceAll("\\s", "").replaceAll("-", "").toLowerCase();
        String[] phraseArr = phrase.split("");

        for (int i = 0; i < phraseArr.length; i++) {
            for (int j = i + 1; j < phraseArr.length; j++) {
                if (phraseArr[i].equals(phraseArr[j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
