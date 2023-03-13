package org.example.P5;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[100];
        try {
            for(int i = 0; i < 10; i++) {
                int x = in.nextInt();
                sum += x;
                arr[i] = x;
            }
        } catch (Exception e) {
            System.out.print("Error");
            return;
        }
        if(check(sum, arr)) {
            System.out.print("Can be balanced");
        } else {
            System.out.print("Can not be balanced");
        }
    }
    public static boolean check(int sum, int[] arr) {
        int currentSum = 0;
        for(int x: arr) {
            currentSum += x;
            if(currentSum == sum / 2) {
                return true;
            }
        }
        return false;
    }
}
