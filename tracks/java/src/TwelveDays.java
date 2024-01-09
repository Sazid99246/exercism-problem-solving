/**
 * The {@code TwelveDays} class represents a utility for generating the lyrics
 * of the "Twelve Days of Christmas" song. It provides methods to retrieve individual verses,
 * a range of verses, or the entire song.
 */
public class TwelveDays {

    /**
     * Default constructor for TwelveDays.
     * This constructor doesn't perform any special operations and is provided
     * to create instances of this class if needed.
     */
    public TwelveDays() {

    }

    /**
     * Generates the full set of lyrics for the "Twelve Days of Christmas" song.
     * 
     * @return An array of strings, each representing a verse of the song.
     */
    private String[] song() {
        String[] song = new String[] {
                "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."
        };
        return song;
    }
    
    /**
     * Retrieves a specific verse from the "Twelve Days of Christmas" song.
     * 
     * @param verseNumber The verse number to retrieve.
     * @return The lyrics of the specified verse.
     */
    String verse(int verseNumber) {
        String text = "";
        String[] songWords = song();
        text += songWords[verseNumber - 1] + "\n";
        return text;
    }

    /**
     * Retrieves a range of verses from the "Twelve Days of Christmas" song.
     * 
     * @param startVerse The starting verse number.
     * @param endVerse The ending verse number.
     * @return The lyrics of the verses in the specified range, each followed by a newline character.
     */
    String verses(int startVerse, int endVerse) {
        String text = "";
        String[] songWords = song();
        for (int i = startVerse - 1; i < endVerse - 1; i++) {
            text += songWords[i] + "\n\n";
        }
        return text + songWords[endVerse - 1] + "\n";
    }

    /**
     * Generates the lyrics for the entire "Twelve Days of Christmas" song.
     * 
     * @return The full song lyrics.
     */
    String sing() {
        String[] songWords = song();
        String text = "";
        for (int i = 0; i < songWords.length - 1; i++) {
            text += songWords[i] + "\n\n";
        }
        return text + songWords[songWords.length - 1] + "\n";
    }
}