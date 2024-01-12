/**
 * This class provides a method to verify the validity of an ISBN-10 number.
 * An ISBN-10 number is a 10-digit code which is used to uniquely identify
 * books.
 * It can contain hyphens and the last character may be an 'X', which represents
 * the value '10'.
 * The validity of an ISBN-10 is checked by a specific formula as described in
 * the isValid method.
 */
public class IsbnVerifier {

    /**
     * Checks if the provided string is a valid ISBN-10.
     * 
     * The method first removes any hyphens from the string and then checks if the
     * resultant
     * string is exactly 10 characters long. Each character is expected to be a
     * digit except
     * possibly the last one, which can be 'X'. The ISBN-10 validation formula is
     * then applied.
     * 
     * The formula for validation is:
     * (d₁ * 10 + d₂ * 9 + d₃ * 8 + d₄ * 7 + d₅ * 6 + d₆ * 5 + d₇ * 4 + d₈ * 3 + d₉
     * * 2 + d₁₀ * 1) mod 11 == 0
     * where d₁ to d₁₀ are the digits of the ISBN and d₁₀ can be 'X' to represent
     * '10'.
     * 
     * @param stringToVerify The ISBN-10 string to verify.
     * @return true if the string is a valid ISBN-10, false otherwise.
     */
    public boolean isValid(String stringToVerify) {

        String numberToVerify = stringToVerify.replaceAll("-", "");

        // Check if the length is exactly 10
        if (numberToVerify.length() != 10) {
            return false;
        }

        int total = 0;
        for (int i = 0; i < numberToVerify.length(); i++) {
            char currentChar = numberToVerify.charAt(i);

            // Check if the last character is 'X'
            if (i == 9 && currentChar == 'X') {
                total += 10;
            } else if (Character.isDigit(currentChar)) {
                total += Character.getNumericValue(currentChar) * (10 - i);
            } else {
                // Invalid character encountered
                return false;
            }
        }
        return total % 11 == 0;
    }
}
