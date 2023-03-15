package org.example.P6;

import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(sumEvenFibonacci(n));
    }
    public static int sumEvenFibonacci(int n) {
        int sum = 0, f1 = 1, f2 = 2;
        while (f2 <= n) {
            if (f2 % 2 == 0) {
                sum += f2;
            }
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return sum;
    }


}
