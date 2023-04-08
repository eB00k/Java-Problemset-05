package org.example.Midterm;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        int a1 = n, b1 = m;
        int c1 = n + m;
        int[] c = new int[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        Arrays.sort(c);
        for(int i = 0; i < c1; ++i) {
            System.out.print(c[i] + " ");
        }
    }
}

