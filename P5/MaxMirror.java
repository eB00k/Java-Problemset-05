package org.example.P5;

import java.util.Scanner;

public class MaxMirror {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = in.nextLine().trim().split(" ");
        int nums[] = new int[arr.length];
        for(int i = 0; i < arr.length; ++i) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        System.out.print(maxMirror(nums, nums.length));
    }

    public static int maxMirror(int[] array, int len) {
        if (len == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j >= 0; j--) {
                int a = i;
                int b = j;
                int temp = 0;
                while (array[a++] == array[b--]) {
                    temp++;
                    if (a >= b) {
                        break;
                    }
                }
                res = max(res, temp);
            }
        }
        return res;
    }
    public static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }
}
