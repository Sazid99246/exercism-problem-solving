package numbers;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        return (int) Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare = 0;

        for (int i = 1; i <= input; i++) {
            sumOfSquare += Math.pow(i, 2);
        }
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    public static void main(String[] args) {
        DifferenceOfSquaresCalculator differenceOfSquaresCalculator = new DifferenceOfSquaresCalculator();
        System.out.println(differenceOfSquaresCalculator.computeDifferenceOfSquares(10));
    }
}
