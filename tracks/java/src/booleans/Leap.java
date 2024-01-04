package booleans;

public class Leap {

    boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Leap year = new Leap();
        System.out.println(year.isLeapYear(1900));
    }
}
