package org.example.P5;

import java.util.Arrays;
import java.util.Scanner;

public class OddsComeFirst {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), j = 0;
        int[] evens = new int[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if(x % 2 == 0) evens[j++] = x;
            else System.out.print(x + " ");
        }
        for(int i = 0; i < j; i++) {
            System.out.print(evens[i] + " ");
        }
    }
}
