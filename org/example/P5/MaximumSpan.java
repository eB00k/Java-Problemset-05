package org.example.P5;

import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = in.nextLine().trim().split(" ");
        System.out.print(maxSpan(arr));
    }

    private static int maxSpan(String[] n) {
        int mx = 1;
        for(int i = 0; i < n.length; ++i) {
            for(int j = i + 1; j < n.length; ++j) {
                if(n[i].equals(n[j])) {
                    mx = Math.max(mx, j - i + 1);
                }
            }
        }
        return mx;
    }
}