package numbers;

public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        char[] numArray = String.valueOf(numberToCheck).toCharArray();
        int len = numArray.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int digit = numArray[i] - '0';
            sum += Math.pow(digit, len);
        }

        return sum == numberToCheck;
    }

    public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers;
        armstrongNumbers = new ArmstrongNumbers();
        System.out.println(armstrongNumbers.isArmstrongNumber(0));
        System.out.println(armstrongNumbers.isArmstrongNumber(10));
        System.out.println(armstrongNumbers.isArmstrongNumber(153));
    }
}
