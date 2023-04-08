package org.example.P5;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        in.nextLine();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                arr[i][j] = in.nextInt();
            }
            in.nextLine();
        }
        if(n == m) System.out.print(isMagicSquare(n, arr));
        else System.out.print(false);
    }

    public static boolean isMagicSquare(int n, int[][] arr) {
        int[] sumCol = new int[n + 1];
        int[] sumRow = new int[n + 1];
        int digSum1 = 0, digSum2 = 0;

        for(int i = 0; i < n; ++i) {
            int curCol = 0, curRow = 0;
            for(int j = 0; j < n; ++j) {
                if(i == j) {
                    digSum1 += arr[i][j];
                }
                if(i + j == n - 1) {
                    digSum2 += arr[i][j];}
                curCol += arr[i][j];
                curRow += arr[j][i];
            }
            sumCol[i] = curCol;
            sumRow[i] = curRow;
        }

        sumCol[n] = digSum1;
        sumRow[n] = digSum2;
        for(int i = 0; i < sumCol.length; i++) {
            for(int j = 0; j < sumRow.length; j++) {
                if(sumCol[i] != sumRow[j]) {
//                    System.out.print("false" + sumCol[i] + " " + sumRow[i]);
                    return false;
                }
            }
        }
        return true;
    }
}