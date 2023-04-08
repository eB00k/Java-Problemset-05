package org.example.P5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n;
        try{
           n = in.nextLong();
        } catch (Exception e) {
            System.out.print("error");
            return;
        }
        System.out.print(digitSum(Math.abs(n)));
    }
    public static long digitSum(long n) {
        long sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
