package org.example.P5;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args)
    {
        System.out.println("Enter N:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            double x = in.nextDouble();
            arr[i] = x;
        }
        Arrays.sort(arr);
        System.out.print(arr[1]);

    }
}
