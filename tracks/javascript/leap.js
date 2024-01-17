
/**
 * Determines if a given year is a leap year.
 * A year is a leap year if it is divisible by 4 but not by 100, except for
 * years that are divisible by 400.
 * @param {int} year the year to be identified
 * @returns True if a year is leap year, False otherwise
 */
export const isLeap = year => {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
};
  