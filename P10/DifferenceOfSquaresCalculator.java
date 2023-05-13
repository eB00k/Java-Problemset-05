package P10;

public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int num) {
        int sum = (num * (num + 1)) / 2;
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int num) {
        return (num * (num + 1) * (2 * num + 1)) / 6;
    }

    public int computeDifferenceOfSquares(int num) {
        return computeSquareOfSumTo(num) - computeSumOfSquaresTo(num);
    }
}
