class PhoneNumber {
    String number;

    PhoneNumber(String numberString) {
        if (numberString.matches(".*[a-zA-Z].*"))
            throw new IllegalArgumentException("letters not permitted");
        if (numberString.matches(".*[?@:!].*"))
            throw new IllegalArgumentException("punctuations not permitted");

        number = numberString.replaceAll("[^\\d]", "");

        if (number.length() < 10)
            throw new IllegalArgumentException("must not be fewer than 10 digits");
        if (number.length() > 11)
            throw new IllegalArgumentException("must not be greater than 11 digits");

        if (number.length() == 11)
            if (number.charAt(0) == '1')
                number = number.substring(1, 11);
            else
                throw new IllegalArgumentException("11 digits must start with 1");

        if (number.matches("^1.*"))
            throw new IllegalArgumentException("area code cannot start with one");
        if (number.matches("^0.*"))
            throw new IllegalArgumentException("area code cannot start with zero");
        if (number.matches("^...1.*"))
            throw new IllegalArgumentException("exchange code cannot start with one");
        if (number.matches("^...0.*"))
            throw new IllegalArgumentException("exchange code cannot start with zero");
    }

    String getNumber() {
        return number;
    }

}