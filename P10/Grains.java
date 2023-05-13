package P10;


import java.math.BigInteger;

public class Grains {
    Grains(){}
    public static BigInteger computeNumberOfGrainsOnSquare(int squareNumber) {
        if (squareNumber < 1 || squareNumber > 64) {
            throw new IllegalArgumentException("Square number must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(squareNumber - 1);
    }

    public static BigInteger computeTotalNumberOfGrainsOnBoard() {
        BigInteger total = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++) {
            total = total.add(computeNumberOfGrainsOnSquare(i));
        }
        return total;
    }
}
