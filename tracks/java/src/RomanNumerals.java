public class RomanNumerals {

    private static int[] numbers = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static String[] romans = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    private int number;
    
    RomanNumerals(int number) { this.number = number; }
    
    private void setNumber(int number) { this.number = number; }
    
    String getRomanNumeral() {
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i <= numbers.length - 1; ++i) {
            while(number >= numbers[i]) {
                roman.append(romans[i]);
                setNumber(number - numbers[i]);
            }
        } return roman.toString();
    }
}