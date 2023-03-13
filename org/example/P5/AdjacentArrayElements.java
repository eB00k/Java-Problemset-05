package org.example.P5;

import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().trim().split(" ");
        if (arr.length != 10 || !areAllIntegers(arr)) {
            System.out.print("Error");
        } else {
            System.out.println(maxAdjacent(arr));
        }
    }

    public static int maxAdjacent(String[] arr) {
        int[] a = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        if (a[0] == a[1]) cnt++;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == a[i+1] && a[i-1] != a[i]) cnt++;
        }
        return cnt;
    }
    public static boolean areAllIntegers(String[] arr) {
        for (String x: arr) {
            try {
                Integer.parseInt(x);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
