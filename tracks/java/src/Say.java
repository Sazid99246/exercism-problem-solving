import static java.util.Map.entry;
import static java.util.Map.ofEntries;

import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Class Say is used to convert a long integer into its equivalent English word
 * representation.
 * It handles numbers up to 999,999,999,999 (less than one trillion) and
 * includes special handling
 * for numbers less than 100 to accommodate the nuances of English number naming
 * conventions.
 */
public class Say {

	/**
	 * Default constructor for Say.
	 * This constructor doesn't perform any special operations and is provided
	 * to create instances of this class if needed.
	 */
	public Say() {

	}

	/**
	 * The maximum number that this class can convert into words.
	 * This limit is set to less than one trillion to align with the provided number
	 * mappings.
	 */
	private static final long MAX_NUMBER = 999_999_999_999L;

	/**
	 * An empty string constant used for string operations where a default or empty
	 * string is needed.
	 */
	private static final String EMPTY = "";

	/**
	 * A space character used for formatting the English word representation of
	 * numbers,
	 * particularly for separating words in multi-word numbers.
	 */
	private static final String SPACE = " ";

	/**
	 * A hyphen character used to connect compound numbers in English, such as
	 * twenty-one.
	 */
	private static final String HYPHEN = "-";

	/**
	 * A mapping of specific numbers to their corresponding English words.
	 * This map includes basic numbers (0-19), tens (20, 30, ... 90), and larger
	 * scales
	 * (hundred, thousand, million, billion) used for constructing the English word
	 * representation
	 * of any number up to the maximum limit.
	 */
	private static final NavigableMap<Long, String> NUMBERS = new TreeMap<>(ofEntries(
			entry(0L, "zero"),
			entry(1L, "one"),
			entry(2L, "two"),
			entry(3L, "three"),
			entry(4L, "four"),
			entry(5L, "five"),
			entry(6L, "six"),
			entry(7L, "seven"),
			entry(8L, "eight"),
			entry(9L, "nine"),
			entry(10L, "ten"),
			entry(11L, "eleven"),
			entry(12L, "twelve"),
			entry(13L, "thirteen"),
			entry(14L, "fourteen"),
			entry(15L, "fifteen"),
			entry(16L, "sixteen"),
			entry(17L, "seventeen"),
			entry(18L, "eighteen"),
			entry(19L, "nineteen"),
			entry(20L, "twenty"),
			entry(30L, "thirty"),
			entry(40L, "forty"),
			entry(50L, "fifty"),
			entry(60L, "sixty"),
			entry(70L, "seventy"),
			entry(80L, "eighty"),
			entry(90L, "ninety"),
			entry(100L, "hundred"),
			entry(1000L, "thousand"),
			entry(1000_000L, "million"),
			entry(1000_000_000L, "billion")));

	/**
	 * Converts a long number into its English word representation.
	 * This method works recursively for numbers greater than 100, breaking down the
	 * number
	 * into smaller parts that correspond to English naming conventions for numbers.
	 *
	 * @param number the number to convert into words. Must be a non-negative number
	 *               and less than or equal to 999,999,999,999.
	 * @return the English word representation of the given number.
	 * @throws IllegalArgumentException if the number is negative or exceeds the
	 *                                  maximum limit.
	 */
	public String say(final long number) {

		if (number < 0 || number > MAX_NUMBER) {
			throw new IllegalArgumentException();
		}

		if (number < 100) {
			return Optional.ofNullable(NUMBERS.get(number))
					.orElseGet(() -> NUMBERS.floorEntry(number).getValue() + HYPHEN + this.say(number % 10));
		}

		return this.say(number / NUMBERS.floorKey(number)) + SPACE
				+ Optional.ofNullable(NUMBERS.get(number)).orElseGet(() -> NUMBERS.floorEntry(number).getValue()
						+ (number % NUMBERS.floorKey(number) > 0 ? SPACE + this.say(number % NUMBERS.floorKey(number))
								: EMPTY));
	}
}