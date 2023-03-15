package org.example.P6;

import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        try {
            int n = in.nextInt(), space = 0, digit = n;
            for(int i = 0; i < n; i++) {
                int k = space++;
                while(k != 0) {
                    System.out.print("  ");
                    k--;
                }
                int j = digit--, l = 1;
                while(j != 0) {
                    System.out.print((l++) + " ");
                    j--;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.print("Incorrect input");
        }
    }
}
